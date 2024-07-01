package calculatorPackage

import Lexer
import java.text.ParseException
import java.io.Reader

private val regexLiterals = mapOf(
    6 to Regex("[0-9]+"),
    7 to Regex("\\s+"),
)
private val literals = mapOf(
    0 to "+",
    1 to "-",
    2 to "/",
    3 to "*",
    4 to "(",
    5 to ")",
)
private val skipTokens = setOf(
    7,
)
object Tokens {
    val PLUS = 0
    val MINUS = 1
    val DIV = 2
    val MUL = 3
    val LPARENTHESIS = 4
    val RPARENTHESIS = 5
    val NUMBER = 6
    val WS = 7
    val EOF = -1
}
class CalculatorLexer(reader: Reader) : Lexer(reader, literals, regexLiterals, skipTokens)
