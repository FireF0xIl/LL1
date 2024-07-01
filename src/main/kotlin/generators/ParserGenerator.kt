package generators

import EOF
import EPSILON
import GrammarListener
import capitalizeFirstChar
import recapitalizeFirstChar
import structures.Element
import structures.ExtendedElement

const val PARSE_ERROR = "throw ParseException(" +
        "\"Expected token `\${lexer.tokens.getValue(token)}`, but received `\${lexer.tokenValue}` at position \${lexer.position}.\"," +
        "lexer.position)"

class ParserGenerator(private val collector: GrammarListener) : Generator() {

    override fun generate(grammarName: String) = buildString {
        if (!checkLL1()) {
            throw IllegalStateException("Grammar is not LL(1)")
        } else {
            val grammarNameCapitalize = grammarName.capitalizeFirstChar()

            printLine("package ${grammarName.recapitalizeFirstChar()}Package")
            appendBlankLine()
            printLine("import java.text.ParseException")
            printLine("import structures.Node")
            appendBlankLine()

            printLine("class ${grammarNameCapitalize}Parser(private val lexer: ${grammarNameCapitalize}Lexer) {")
            appendBlankLine()

            makeIndent {
                printLine("private fun checkAndMove(token: Int): String {")
                makeIndent {
                    printLine("if (lexer.token != token) {")
                    makeIndent {
                        printLine(PARSE_ERROR)
                    }
                    printLine("}")
                    printLine("return lexer.tokenValue!!.also { lexer.next() }")
                }
                printLine("}")

                collector.rules.forEach { (ruleName, rule) ->
                    appendBlankLine()
                    printLine(
                        "private fun ${ruleName}(${rule.getArgs()}): " +
                                "${rule.returnType ?: "Unit"} = "
                    )
                    makeIndent {
                        printLine("when (lexer.token) {")
                        makeIndent {
                            rule.elements.associate {
                                if (it[0].value == EPSILON) {
                                    it to follow.getValue(ruleName).toList()
                                } else {
                                    it to first.getValue(it[0].value).toList()
                                }
                            }.also {
                                it.values.flatten().run {
                                    if (size != distinct().size) {
                                        throw IllegalStateException("Grammar is not LL(1)")
                                    }
                                }
                            }.forEach { (element, tokens) ->
                                printLine("${
                                    tokens.joinToString(", ", "", " -> ",
                                        transform = { "Tokens.$it" }
                                    )
                                } {")
                                makeIndent {
                                    val args = element.groupingBy(Element::value).eachCount().filterValues { it > 1 }
                                    args.forEach { (k, _) ->
                                        when (k) {
                                            in collector.getTerminals() -> printLine("val $k = mutableListOf<String>()")
                                            in collector.getNonTerminals() -> {
                                                val ret = collector.rules[k]?.returnType
                                                if (ret != null) {
                                                    printLine("val $k = mutableListOf<$ret>()")
                                                }
                                            }
                                        }
                                    }

                                    for (elem in element.extended) {
                                        when (elem) {
                                            is ExtendedElement.Code -> printLine(elem.value)
                                            is ExtendedElement.Sample -> when (val inner = elem.element) {
                                                is Element.Terminal -> {
                                                    when (val value = inner.value) {
                                                        EPSILON -> continue
                                                        in args -> printLine("$value.add(checkAndMove(Tokens.$value))")
                                                        else -> printLine("val $value = checkAndMove(Tokens.$value)")
                                                    }
                                                }
                                                is Element.NonTerminal -> {
                                                    val attr = inner.callAttributes?.joinToString().orEmpty()
                                                    if (inner.value in args) {
                                                        printLine("${inner.value}.add(${inner.value}($attr))")
                                                    } else {
                                                        printLine("val ${inner.value} = ${inner.value}($attr)")
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                printLine("}")
                            }

                            printLine("else -> {")
                            makeIndent {
                                printLine(
                                    "throw ParseException(" +
                                            "\"Unexpected token `\${lexer.tokenValue}` at position \${lexer.position}.\"," +
                                            "lexer.position)"
                                )
                            }
                            printLine("}")
                        }
                        printLine("}")
                    }
                }
                appendBlankLine()
                val entryRule = collector.rules.getValue(collector.startPoint)
                printLine("fun parse(${entryRule.getArgs()}): ${entryRule.returnType ?: "Unit"} {")
                makeIndent {
                    printLine("lexer.next()")
                    printLine("return ${collector.startPoint}(${entryRule.arguments?.joinToString { (a, _) -> a } ?: ""})")
                }
                printLine("}")
            }
            printLine("}")
        }

    }

    private val first: Map<String, Set<String>> by lazy {
        val first = mutableMapOf<String, MutableSet<String>>()
        collector.getTerminals().forEach { first[it] = mutableSetOf(it) }
        collector.rules.forEach { (ruleName, rule) ->
            first[ruleName] = mutableSetOf()
            if (rule.elements.any { it[0].value == EPSILON }) {
                first.getValue(ruleName).add(EPSILON)
            }
        }

        do {
            var changed = false
            collector.rules.forEach { (ruleName, rule) ->
                rule.elements.forEach { element ->
                    for (i in 0 until element.size) {
                        val elementName = element[i].value
                        if (EPSILON in first.getValue(elementName)) {
                            changed = changed || first.getValue(ruleName).addAll(first.getValue(elementName))
                            if (i == element.size - 1) {
                                changed = changed || first.getValue(ruleName).add(EPSILON)
                            }
                        } else {
                            changed = changed || first.getValue(ruleName).addAll(first.getValue(elementName))
                            break
                        }
                    }
                }
            }
        } while (changed)

        return@lazy first
    }


    private val follow: Map<String, Set<String>> by lazy {
        val follow = mutableMapOf<String, MutableSet<String>>()
        collector.getNonTerminals().forEach { follow[it] = mutableSetOf() }
        follow.getValue(collector.startPoint).add(EOF)

        do {
            var changed = false
            collector.rules.forEach { (ruleName, rule) ->
                rule.elements.forEach { element ->
                    (0..element.size - 2).filter {
                        element[it] is Element.NonTerminal
                    }.forEach { i ->
                        changed = changed || follow.getValue(element[i].value).addAll(
                            first.getValue(element[i + 1].value).filter { it != EPSILON }
                        )
                    }
                    if (element.last() is Element.NonTerminal) {
                        changed = changed || follow.getValue(element.last().value).addAll(follow.getValue(ruleName))
                    }
                    if (element.size > 1 && EPSILON in first.getValue(element.last().value)) {
                        val tmp = element[element.size - 2]
                        if (tmp is Element.NonTerminal) {
                            changed = changed || follow.getValue(tmp.value).addAll(follow.getValue(ruleName))
                        }
                    }
                }
            }

        } while (changed)

        return@lazy follow
    }

    private fun checkLL1(): Boolean {
        var left = false
        var right = false
        collector.rules.forEach { (ruleName, rule) ->
            left = left || rule.elements.any { it.first().value == ruleName }
            right = right || rule.elements.any { elementOut ->
                rule.elements.any { elementInner ->
                    elementInner != elementOut && elementInner.first().value == elementOut.first().value
                }
            }
        }

        return !left && !right
    }
}