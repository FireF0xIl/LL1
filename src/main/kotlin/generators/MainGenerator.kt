package generators

import capitalizeFirstChar
import recapitalizeFirstChar

class MainGenerator : Generator() {
    override fun generate(grammarName: String) = buildString {
        val grammarNameCapitalize = grammarName.capitalizeFirstChar()
        printLine("package ${grammarName.recapitalizeFirstChar()}Package")
        appendBlankLine()
        printLine("fun main(args: Array<String>) {")
        makeIndent {
            printLine("assert(args.isNotEmpty())")
            printLine("if (args.isEmpty()) {")
            makeIndent {
                printLine("throw Exception(\"No input data\")")
            }
            printLine("}")
            printLine("println(${grammarNameCapitalize}Parser(${grammarNameCapitalize}Lexer(args[0].reader())).parse()) ")
        }
        printLine("}")

    }
}
