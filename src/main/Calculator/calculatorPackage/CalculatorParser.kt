package calculatorPackage

import java.text.ParseException
import structures.Node

class CalculatorParser(private val lexer: CalculatorLexer) {

    private fun checkAndMove(token: Int): String {
        if (lexer.token != token) {
            throw ParseException("Expected token `${lexer.tokens.getValue(token)}`, but received `${lexer.tokenValue}` at position ${lexer.position}.",lexer.position)
        }
        return lexer.tokenValue!!.also { lexer.next() }
    }

    private fun expr(): Int = 
        when (lexer.token) {
            Tokens.LPARENTHESIS, Tokens.NUMBER ->  {
                val term = term()
                val exprs = exprs(term)
                exprs
            }
            else -> {
                throw ParseException("Unexpected token `${lexer.tokenValue}` at position ${lexer.position}.",lexer.position)
            }
        }

    private fun exprs(acc: Int): Int = 
        when (lexer.token) {
            Tokens.PLUS ->  {
                val PLUS = checkAndMove(Tokens.PLUS)
                val term = term()
                val next = acc + term
                val exprs = exprs(next)
                exprs
            }
            Tokens.MINUS ->  {
                val MINUS = checkAndMove(Tokens.MINUS)
                val term = term()
                val next = acc - term
                val exprs = exprs(next)
                exprs
            }
            Tokens.EOF, Tokens.RPARENTHESIS ->  {
                acc
            }
            else -> {
                throw ParseException("Unexpected token `${lexer.tokenValue}` at position ${lexer.position}.",lexer.position)
            }
        }

    private fun term(): Int = 
        when (lexer.token) {
            Tokens.LPARENTHESIS, Tokens.NUMBER ->  {
                val single = single()
                val terms = terms(single)
                terms
            }
            else -> {
                throw ParseException("Unexpected token `${lexer.tokenValue}` at position ${lexer.position}.",lexer.position)
            }
        }

    private fun terms(acc: Int): Int = 
        when (lexer.token) {
            Tokens.MUL ->  {
                val MUL = checkAndMove(Tokens.MUL)
                val single = single()
                val terms = terms(acc * single)
                terms
            }
            Tokens.DIV ->  {
                val DIV = checkAndMove(Tokens.DIV)
                val single = single()
                val terms = terms(acc / single)
                terms
            }
            Tokens.PLUS, Tokens.MINUS, Tokens.EOF, Tokens.RPARENTHESIS ->  {
                acc
            }
            else -> {
                throw ParseException("Unexpected token `${lexer.tokenValue}` at position ${lexer.position}.",lexer.position)
            }
        }

    private fun single(): Int = 
        when (lexer.token) {
            Tokens.LPARENTHESIS ->  {
                val LPARENTHESIS = checkAndMove(Tokens.LPARENTHESIS)
                val expr = expr()
                val RPARENTHESIS = checkAndMove(Tokens.RPARENTHESIS)
                expr
            }
            Tokens.NUMBER ->  {
                val num = num()
                num
            }
            else -> {
                throw ParseException("Unexpected token `${lexer.tokenValue}` at position ${lexer.position}.",lexer.position)
            }
        }

    private fun num(): Int = 
        when (lexer.token) {
            Tokens.NUMBER ->  {
                val NUMBER = checkAndMove(Tokens.NUMBER)
                NUMBER.toInt()
            }
            else -> {
                throw ParseException("Unexpected token `${lexer.tokenValue}` at position ${lexer.position}.",lexer.position)
            }
        }

    fun parse(): Int {
        lexer.next()
        return expr()
    }
}
