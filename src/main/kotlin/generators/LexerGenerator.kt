package generators

import GrammarListener
import recapitalizeFirstChar
import java.util.*

class LexerGenerator(private val collector: GrammarListener) : Generator() {
    override fun generate(grammarName: String) = buildString {

        appendLine("package ${grammarName.recapitalizeFirstChar()}Package")
        appendBlankLine()
        appendLine("import Lexer")
        appendLine("import java.text.ParseException")
        printLine("import java.io.Reader")
        appendBlankLine()
        printLine("private val regexLiterals = mapOf(")
        makeIndent {
            collector.regexLiterals.forEach { (key, value) ->
                printLine("$key to Regex(\"${value.toString().escape()}\"),")
            }
        }
        printLine(")")
        printLine("private val literals = mapOf(")
        makeIndent {
            collector.literals.forEach {
                printLine("${it.key} to \"${it.value}\",")
            }
        }
        printLine(")")

        printLine("private val skipTokens = setOf(")
        makeIndent {
            collector.skipTokens.forEach {
                printLine("$it,")
            }
        }
        printLine(")")
        printLine("object Tokens {")
        makeIndent {
            (collector.tokenMap - collector.skipTokens).forEach {
                printLine("val ${it.key} = ${it.value}")
            }
        }
        printLine("}")
        printLine(buildString {
            append("class ")
            append(grammarName.replaceFirstChar {
                if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString()
            })
            append("Lexer(reader: Reader) : Lexer(reader, literals, regexLiterals, skipTokens)")
        })
    }

}