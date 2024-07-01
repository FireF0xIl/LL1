import structures.ExtendedElement
import structures.ParseElements
import structures.Rule
import structures.Element

class GrammarListener : GrammarParserBaseListener() {
    var tokensCount = 0
    lateinit var startPoint: String

    val tokenMap: MutableMap<String, Int> = mutableMapOf()

    val skipTokens: MutableSet<Int> = mutableSetOf()

    val regexLiterals: MutableMap<Int, Regex> = mutableMapOf()
    val literals: MutableMap<Int, String> = mutableMapOf()

    val rules: MutableMap<String, Rule> = mutableMapOf()
    var emptyRules = false

    fun getNonTerminals() = rules.keys
    fun getTerminals() = if (emptyRules) tokenMap.keys + EPSILON else tokenMap.keys

    override fun exitEntryPoint(ctx: GrammarParserParser.EntryPointContext) {
        startPoint = ctx.NON_TERMINAL().text
    }

    override fun exitParse_rule(ctx: GrammarParserParser.Parse_ruleContext) {
        val ruleName = ctx.NON_TERMINAL().text
        val rule = rules.getOrPut(ruleName) { Rule() }
        if (ctx.input_attributes() != null) {
            rule.arguments = ctx.input_attributes().attribute().map {
                it.attribute_name().text to it.attribute_value().text
            }
        }
        if (ctx.output_attributes() != null) {
            rule.returnType = ctx.output_attributes().text
        }
        rule.elements = ctx.rule_elements().map { ctxOut ->
            var element = if (ctxOut.element().isEmpty()) {
                emptyRules = true
                listOf(ExtendedElement.Sample(Element.Terminal(EPSILON)))
            } else {
                ctxOut.element().map { element ->
                    when {
                        element.NON_TERMINAL() != null -> ExtendedElement.Sample(
                            Element.NonTerminal(
                                element.NON_TERMINAL().text,
                                element.arguments()?.argument()?.map { it.text.trim('{', '}', ' ') }
                            )
                        )
                        element.TERMINAL() != null -> ExtendedElement.Sample(Element.Terminal(element.TERMINAL().text))
                        else -> ExtendedElement.Code(element.CODE().text.trim('{', '}', ' '))
                    }
                }
            }
            var elems = element.filterIsInstance<ExtendedElement.Sample>()
            if (elems.isEmpty()) {
                emptyRules = true
                elems = listOf(ExtendedElement.Sample(Element.Terminal(EPSILON)))
                element = elems + element
            }
            ParseElements(elems.map { it.element }, element)

        }
    }


    override fun exitTokenRule(ctx: GrammarParserParser.TokenRuleContext) {
        putToken(ctx.TERMINAL().text, ctx.terminal_value(), false)
    }

    override fun exitSkipRule(ctx: GrammarParserParser.SkipRuleContext) {
        putToken(ctx.TERMINAL().text, ctx.terminal_value(), true)
    }

    override fun exitFile(ctx: GrammarParserParser.FileContext) {
        tokenMap[EOF] = -1
    }

    private fun putToken(token: String, value: GrammarParserParser.Terminal_valueContext, skip: Boolean) {
        val id = tokenMap.getOrPut(token) { tokensCount++ }
        if (skip) {
            skipTokens.add(id)
        }
        when {
            value.STRING() != null -> literals[id] = value.STRING().text.trim('\"')
            value.REGEX() != null -> this.regexLiterals[id] = Regex(value.REGEX().text.trim('\''))
        }
    }
}