package forPackage

import java.text.ParseException
import structures.Node

class ForParser(private val lexer: ForLexer) {

    private fun checkAndMove(token: Int): String {
        if (lexer.token != token) {
            throw ParseException("Expected token `${lexer.tokens.getValue(token)}`, but received `${lexer.tokenValue}` at position ${lexer.position}.",lexer.position)
        }
        return lexer.tokenValue!!.also { lexer.next() }
    }

    private fun forLoopExpression(): Node = 
        when (lexer.token) {
            Tokens.FOR ->  {
                val SEMICOLON = mutableListOf<String>()
                val FOR = checkAndMove(Tokens.FOR)
                val LPARENTHESIS = checkAndMove(Tokens.LPARENTHESIS)
                val init = init()
                SEMICOLON.add(checkAndMove(Tokens.SEMICOLON))
                val condition = condition()
                SEMICOLON.add(checkAndMove(Tokens.SEMICOLON))
                val iteration = iteration()
                val RPARENTHESIS = checkAndMove(Tokens.RPARENTHESIS)
                Node("for statement", listOf(
                                                  Node(FOR),
                                                  Node(LPARENTHESIS),
                                                  init,
                                                  Node(SEMICOLON[0]),
                                                  condition,
                                                  Node(SEMICOLON[1]),
                                                  iteration,
                                                  Node(RPARENTHESIS)
                                                ))
            }
            else -> {
                throw ParseException("Unexpected token `${lexer.tokenValue}` at position ${lexer.position}.",lexer.position)
            }
        }

    private fun init(): Node = 
        when (lexer.token) {
            Tokens.INT ->  {
                val type = type()
                val VARIABLE = checkAndMove(Tokens.VARIABLE)
                val ASSIGN = checkAndMove(Tokens.ASSIGN)
                val VALUE = checkAndMove(Tokens.VALUE)
                val additionalVar = additionalVar(mutableListOf())
                Node("INIT", listOf(type, Node("variable", VARIABLE), Node("assign", ASSIGN), Node("value", VALUE)) + additionalVar)
            }
            else -> {
                throw ParseException("Unexpected token `${lexer.tokenValue}` at position ${lexer.position}.",lexer.position)
            }
        }

    private fun condition(): Node = 
        when (lexer.token) {
            Tokens.VARIABLE ->  {
                val VARIABLE = checkAndMove(Tokens.VARIABLE)
                val comparison = comparison()
                val VALUE = checkAndMove(Tokens.VALUE)
                val additionalBool = additionalBool(mutableListOf())
                Node("COND", listOf(Node("variable", VARIABLE), comparison, Node("value", VALUE)) + additionalBool)
            }
            Tokens.VALUE ->  {
                val VALUE = checkAndMove(Tokens.VALUE)
                val comparison = comparison()
                val VARIABLE = checkAndMove(Tokens.VARIABLE)
                val additionalBool = additionalBool(mutableListOf())
                Node("COND", listOf(Node("value", VALUE), comparison, Node("variable", VARIABLE)) + additionalBool)
            }
            else -> {
                throw ParseException("Unexpected token `${lexer.tokenValue}` at position ${lexer.position}.",lexer.position)
            }
        }

    private fun iteration(): Node = 
        when (lexer.token) {
            Tokens.VARIABLE ->  {
                val VARIABLE = checkAndMove(Tokens.VARIABLE)
                val unaryOperation = unaryOperation()
                Node("ITER", listOf(Node("variable", VARIABLE), unaryOperation))
            }
            Tokens.INCREMENT, Tokens.DECREMENT ->  {
                val unaryOperation = unaryOperation()
                val VARIABLE = checkAndMove(Tokens.VARIABLE)
                Node("ITER", listOf(unaryOperation, Node("variable", VARIABLE)))
            }
            else -> {
                throw ParseException("Unexpected token `${lexer.tokenValue}` at position ${lexer.position}.",lexer.position)
            }
        }

    private fun unaryOperation(): Node = 
        when (lexer.token) {
            Tokens.INCREMENT ->  {
                val INCREMENT = checkAndMove(Tokens.INCREMENT)
                Node("unaryOperation", INCREMENT)
            }
            Tokens.DECREMENT ->  {
                val DECREMENT = checkAndMove(Tokens.DECREMENT)
                Node("unaryOperation", DECREMENT)
            }
            else -> {
                throw ParseException("Unexpected token `${lexer.tokenValue}` at position ${lexer.position}.",lexer.position)
            }
        }

    private fun comparison(): Node = 
        when (lexer.token) {
            Tokens.NEQ ->  {
                val NEQ = checkAndMove(Tokens.NEQ)
                Node("comparison", NEQ)
            }
            Tokens.LE ->  {
                val LE = checkAndMove(Tokens.LE)
                Node("comparison", LE)
            }
            Tokens.GE ->  {
                val GE = checkAndMove(Tokens.GE)
                Node("comparison", GE)
            }
            Tokens.LT ->  {
                val LT = checkAndMove(Tokens.LT)
                Node("comparison", LT)
            }
            Tokens.GT ->  {
                val GT = checkAndMove(Tokens.GT)
                Node("comparison", GT)
            }
            Tokens.EQ ->  {
                val EQ = checkAndMove(Tokens.EQ)
                Node("comparison", EQ)
            }
            else -> {
                throw ParseException("Unexpected token `${lexer.tokenValue}` at position ${lexer.position}.",lexer.position)
            }
        }

    private fun type(): Node = 
        when (lexer.token) {
            Tokens.INT ->  {
                val INT = checkAndMove(Tokens.INT)
                Node("type", INT)
            }
            else -> {
                throw ParseException("Unexpected token `${lexer.tokenValue}` at position ${lexer.position}.",lexer.position)
            }
        }

    private fun additionalVar(acc: MutableList<Node>): MutableList<Node> = 
        when (lexer.token) {
            Tokens.COMMA ->  {
                val COMMA = checkAndMove(Tokens.COMMA)
                val VARIABLE = checkAndMove(Tokens.VARIABLE)
                val ASSIGN = checkAndMove(Tokens.ASSIGN)
                val VALUE = checkAndMove(Tokens.VALUE)
                acc.addAll(listOf(Node("comma", COMMA), Node("variable", VARIABLE), Node("assign", ASSIGN), Node("value", VALUE)))
                val additionalVar = additionalVar(acc)
                acc
            }
            Tokens.SEMICOLON ->  {
                acc
            }
            else -> {
                throw ParseException("Unexpected token `${lexer.tokenValue}` at position ${lexer.position}.",lexer.position)
            }
        }

    private fun additionalBool(acc: MutableList<Node>): MutableList<Node> = 
        when (lexer.token) {
            Tokens.AND, Tokens.OR, Tokens.XOR ->  {
                val boolOperator = boolOperator()
                acc.add(boolOperator)
                val additionalBool2 = additionalBool2(acc)
                acc
            }
            Tokens.SEMICOLON ->  {
                acc
            }
            else -> {
                throw ParseException("Unexpected token `${lexer.tokenValue}` at position ${lexer.position}.",lexer.position)
            }
        }

    private fun additionalBool2(acc: MutableList<Node>): MutableList<Node> = 
        when (lexer.token) {
            Tokens.VARIABLE ->  {
                val VARIABLE = checkAndMove(Tokens.VARIABLE)
                val comparison = comparison()
                val VALUE = checkAndMove(Tokens.VALUE)
                acc.addAll(listOf(Node("additionalBool", listOf(Node("variable", VARIABLE), comparison, Node("value", VALUE)))))
                val additionalBool = additionalBool(acc)
                acc
            }
            Tokens.VALUE ->  {
                val VALUE = checkAndMove(Tokens.VALUE)
                val comparison = comparison()
                val VARIABLE = checkAndMove(Tokens.VARIABLE)
                acc.addAll(listOf(Node("additionalBool", listOf(Node("value", VALUE), comparison, Node("variable", VARIABLE)))))
                val additionalBool = additionalBool(acc)
                acc
            }
            Tokens.SEMICOLON ->  {
                acc
            }
            else -> {
                throw ParseException("Unexpected token `${lexer.tokenValue}` at position ${lexer.position}.",lexer.position)
            }
        }

    private fun boolOperator(): Node = 
        when (lexer.token) {
            Tokens.AND ->  {
                val AND = checkAndMove(Tokens.AND)
                Node("boolOperator", "&&")
            }
            Tokens.OR ->  {
                val OR = checkAndMove(Tokens.OR)
                Node("boolOperator", "||")
            }
            Tokens.XOR ->  {
                val XOR = checkAndMove(Tokens.XOR)
                Node("boolOperator", "^")
            }
            else -> {
                throw ParseException("Unexpected token `${lexer.tokenValue}` at position ${lexer.position}.",lexer.position)
            }
        }

    fun parse(): Node {
        lexer.next()
        return forLoopExpression()
    }
}
