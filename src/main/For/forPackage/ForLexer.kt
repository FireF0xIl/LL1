package forPackage

import Lexer
import java.text.ParseException
import java.io.Reader

private val regexLiterals = mapOf(
    18 to Regex("[0-9]+"),
    19 to Regex("[a-zA-Z0-9]+"),
    20 to Regex("\\s+"),
)
private val literals = mapOf(
    0 to "for",
    1 to "++",
    2 to "--",
    3 to "&&",
    4 to "||",
    5 to "<=",
    6 to ">=",
    7 to "==",
    8 to "!=",
    9 to "<",
    10 to ">",
    11 to "^",
    12 to "=",
    13 to ";",
    14 to ",",
    15 to "(",
    16 to ")",
    17 to "int",
)
private val skipTokens = setOf(
    20,
)
object Tokens {
    val FOR = 0
    val INCREMENT = 1
    val DECREMENT = 2
    val AND = 3
    val OR = 4
    val LE = 5
    val GE = 6
    val EQ = 7
    val NEQ = 8
    val LT = 9
    val GT = 10
    val XOR = 11
    val ASSIGN = 12
    val SEMICOLON = 13
    val COMMA = 14
    val LPARENTHESIS = 15
    val RPARENTHESIS = 16
    val INT = 17
    val VALUE = 18
    val VARIABLE = 19
    val WHITESPACE = 20
    val EOF = -1
}
class ForLexer(reader: Reader) : Lexer(reader, literals, regexLiterals, skipTokens)
