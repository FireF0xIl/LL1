package forPackage

import structures.Node
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Timeout
import org.junit.jupiter.api.assertThrows

class ForParseTests {
    companion object {
        private object Token {
            val FOR = "for"
            val LEFT_PARENTHESIS = "("
            val RIGHT_PARENTHESIS = ")"
            val TYPE_DECLARATION = "type"
            val VARIABLE = "variable"
            val ASSIGN = "="
            val VALUE = "value"
            val COMPARE = "comparison"
            val CHANGE = "unaryOperation"
            val DELIMITER = ";"
            val END = "end of `for` statement"
        }
        private const val TIMEOUT = 5L
        private val sample = Node("for statement",
            listOf(
                Node(Token.FOR),
                Node(Token.LEFT_PARENTHESIS),
                Node("INIT",
                    listOf(
                        Node(Token.TYPE_DECLARATION, "int"),
                        Node(Token.VARIABLE, "i"),
                        Node("assign", Token.ASSIGN),
                        Node(Token.VALUE, "0")
                    )),
                Node(Token.DELIMITER),
                Node("COND",
                    listOf(
                        Node(Token.VARIABLE, "i"),
                        Node(Token.COMPARE, "<"),
                        Node(Token.VALUE, "10")
                    )),
                Node(Token.DELIMITER),
                Node("ITER",
                    listOf(
                        Node(Token.VARIABLE, "i"),
                        Node(Token.CHANGE, "++")
                    )),
                Node(Token.RIGHT_PARENTHESIS)
            )
        )
    }

    @Test
    @Timeout(TIMEOUT)
    fun `Sample test`() {
        testInput("for (int i = 0; i < 10; i++)",
            sample
        )
    }
    //for (int i = 0, c= 5; i < 10 && || ^; i++)

    @Test
    @Timeout(TIMEOUT)
    fun `Sample test2`() {
        testInput("for(int i=0;i<10;i++)",
            sample
        )
    }

    @Test
    @Timeout(TIMEOUT)
    fun `different whitespaces`() {
        testInput("     for     (   int     i        =    0     ;   i        <       10           ;      i   ++ )",
            sample
        )
    }

    @Test
    @Timeout(TIMEOUT)
    fun `Different compares`() {
        testInput("for (int i = 0; i <= 10; i++)",
            Node("for statement",
                listOf(
                    Node(Token.FOR),
                    Node(Token.LEFT_PARENTHESIS),
                    Node("INIT",
                        listOf(
                            Node(Token.TYPE_DECLARATION, "int"),
                            Node(Token.VARIABLE, "i"),
                            Node("assign", Token.ASSIGN),
                            Node(Token.VALUE, "0")
                        )),
                    Node(Token.DELIMITER),
                    Node("COND",
                        listOf(
                            Node(Token.VARIABLE, "i"),
                            Node(Token.COMPARE, "<="),
                            Node(Token.VALUE, "10")
                        )),
                    Node(Token.DELIMITER),
                    Node("ITER",
                        listOf(
                            Node(Token.VARIABLE, "i"),
                            Node(Token.CHANGE, "++")
                        )),
                    Node(Token.RIGHT_PARENTHESIS)
                )
            )
        )

        testInput("for (int i = 0; i >= 10; i++)",
            Node("for statement",
                listOf(
                    Node(Token.FOR),
                    Node(Token.LEFT_PARENTHESIS),
                    Node("INIT",
                        listOf(
                            Node(Token.TYPE_DECLARATION, "int"),
                            Node(Token.VARIABLE, "i"),
                            Node("assign", Token.ASSIGN),
                            Node(Token.VALUE, "0")
                        )),
                    Node(Token.DELIMITER),
                    Node("COND",
                        listOf(
                            Node(Token.VARIABLE, "i"),
                            Node(Token.COMPARE, ">="),
                            Node(Token.VALUE, "10")
                        )),
                    Node(Token.DELIMITER),
                    Node("ITER",
                        listOf(
                            Node(Token.VARIABLE, "i"),
                            Node(Token.CHANGE, "++")
                        )),
                    Node(Token.RIGHT_PARENTHESIS)
                )
            )
        )

        testInput("for (int i = 0; i != 10; i++)",
            Node("for statement",
                listOf(
                    Node(Token.FOR),
                    Node(Token.LEFT_PARENTHESIS),
                    Node("INIT",
                        listOf(
                            Node(Token.TYPE_DECLARATION, "int"),
                            Node(Token.VARIABLE, "i"),
                            Node("assign", Token.ASSIGN),
                            Node(Token.VALUE, "0")
                        )),
                    Node(Token.DELIMITER),
                    Node("COND",
                        listOf(
                            Node(Token.VARIABLE, "i"),
                            Node(Token.COMPARE, "!="),
                            Node(Token.VALUE, "10")
                        )),
                    Node(Token.DELIMITER),
                    Node("ITER",
                        listOf(
                            Node(Token.VARIABLE, "i"),
                            Node(Token.CHANGE, "++")
                        )),
                    Node(Token.RIGHT_PARENTHESIS)
                )
            )
        )
        testInput("for (int i = 0; i == 10; i++)",
            Node("for statement",
                listOf(
                    Node(Token.FOR),
                    Node(Token.LEFT_PARENTHESIS),
                    Node("INIT",
                        listOf(
                            Node(Token.TYPE_DECLARATION, "int"),
                            Node(Token.VARIABLE, "i"),
                            Node("assign", Token.ASSIGN),
                            Node(Token.VALUE, "0")
                        )),
                    Node(Token.DELIMITER),
                    Node("COND",
                        listOf(
                            Node(Token.VARIABLE, "i"),
                            Node(Token.COMPARE, "=="),
                            Node(Token.VALUE, "10")
                        )),
                    Node(Token.DELIMITER),
                    Node("ITER",
                        listOf(
                            Node(Token.VARIABLE, "i"),
                            Node(Token.CHANGE, "++")
                        )),
                    Node(Token.RIGHT_PARENTHESIS)
                )
            )
        )
        testInput("for (int i = 0; i > 10; i++)",
            Node("for statement",
                listOf(
                    Node(Token.FOR),
                    Node(Token.LEFT_PARENTHESIS),
                    Node("INIT",
                        listOf(
                            Node(Token.TYPE_DECLARATION, "int"),
                            Node(Token.VARIABLE, "i"),
                            Node("assign", Token.ASSIGN),
                            Node(Token.VALUE, "0")
                        )),
                    Node(Token.DELIMITER),
                    Node("COND",
                        listOf(
                            Node(Token.VARIABLE, "i"),
                            Node(Token.COMPARE, ">"),
                            Node(Token.VALUE, "10")
                        )),
                    Node(Token.DELIMITER),
                    Node("ITER",
                        listOf(
                            Node(Token.VARIABLE, "i"),
                            Node(Token.CHANGE, "++")
                        )),
                    Node(Token.RIGHT_PARENTHESIS)
                )
            )
        )
        testInput("for (int i = 0; i < 10; i++)",
            Node("for statement",
                listOf(
                    Node(Token.FOR),
                    Node(Token.LEFT_PARENTHESIS),
                    Node("INIT",
                        listOf(
                            Node(Token.TYPE_DECLARATION, "int"),
                            Node(Token.VARIABLE, "i"),
                            Node("assign", Token.ASSIGN),
                            Node(Token.VALUE, "0")
                        )),
                    Node(Token.DELIMITER),
                    Node("COND",
                        listOf(
                            Node(Token.VARIABLE, "i"),
                            Node(Token.COMPARE, "<"),
                            Node(Token.VALUE, "10")
                        )),
                    Node(Token.DELIMITER),
                    Node("ITER",
                        listOf(
                            Node(Token.VARIABLE, "i"),
                            Node(Token.CHANGE, "++")
                        )),
                    Node(Token.RIGHT_PARENTHESIS)
                )
            )
        )
    }


    @Test
    @Timeout(TIMEOUT)
    fun `Different iterators`() {
        testInput("for (int i = 0; i < 10; i++)",
            Node("for statement",
                listOf(
                    Node(Token.FOR),
                    Node(Token.LEFT_PARENTHESIS),
                    Node("INIT",
                        listOf(
                            Node(Token.TYPE_DECLARATION, "int"),
                            Node(Token.VARIABLE, "i"),
                            Node("assign", Token.ASSIGN),
                            Node(Token.VALUE, "0")
                        )),
                    Node(Token.DELIMITER),
                    Node("COND",
                        listOf(
                            Node(Token.VARIABLE, "i"),
                            Node(Token.COMPARE, "<"),
                            Node(Token.VALUE, "10")
                        )),
                    Node(Token.DELIMITER),
                    Node("ITER",
                        listOf(
                            Node(Token.VARIABLE, "i"),
                            Node(Token.CHANGE, "++")
                        )),
                    Node(Token.RIGHT_PARENTHESIS)
                )
            )
        )
        testInput("for (int i = 0; i < 10; i--)",
            Node("for statement",
                listOf(
                    Node(Token.FOR),
                    Node(Token.LEFT_PARENTHESIS),
                    Node("INIT",
                        listOf(
                            Node(Token.TYPE_DECLARATION, "int"),
                            Node(Token.VARIABLE, "i"),
                            Node("assign", Token.ASSIGN),
                            Node(Token.VALUE, "0")
                        )),
                    Node(Token.DELIMITER),
                    Node("COND",
                        listOf(
                            Node(Token.VARIABLE, "i"),
                            Node(Token.COMPARE, "<"),
                            Node(Token.VALUE, "10")
                        )),
                    Node(Token.DELIMITER),
                    Node("ITER",
                        listOf(
                            Node(Token.VARIABLE, "i"),
                            Node(Token.CHANGE, "--")
                        )),
                    Node(Token.RIGHT_PARENTHESIS)
                )
            )
        )
        testInput("for (int i = 0; i < 10; ++i)",
            Node("for statement",
                listOf(
                    Node(Token.FOR),
                    Node(Token.LEFT_PARENTHESIS),
                    Node("INIT",
                        listOf(
                            Node(Token.TYPE_DECLARATION, "int"),
                            Node(Token.VARIABLE, "i"),
                            Node("assign", Token.ASSIGN),
                            Node(Token.VALUE, "0")
                        )),
                    Node(Token.DELIMITER),
                    Node("COND",
                        listOf(
                            Node(Token.VARIABLE, "i"),
                            Node(Token.COMPARE, "<"),
                            Node(Token.VALUE, "10")
                        )),
                    Node(Token.DELIMITER),
                    Node("ITER",
                        listOf(
                            Node(Token.CHANGE, "++"),
                            Node(Token.VARIABLE, "i")
                        )),
                    Node(Token.RIGHT_PARENTHESIS)
                )
            )
        )
        testInput("for (int i = 0; i < 10; --i)",
            Node("for statement",
                listOf(
                    Node(Token.FOR),
                    Node(Token.LEFT_PARENTHESIS),
                    Node("INIT",
                        listOf(
                            Node(Token.TYPE_DECLARATION, "int"),
                            Node(Token.VARIABLE, "i"),
                            Node("assign", Token.ASSIGN),
                            Node(Token.VALUE, "0")
                        )),
                    Node(Token.DELIMITER),
                    Node("COND",
                        listOf(
                            Node(Token.VARIABLE, "i"),
                            Node(Token.COMPARE, "<"),
                            Node(Token.VALUE, "10")
                        )),
                    Node(Token.DELIMITER),
                    Node("ITER",
                        listOf(
                            Node(Token.CHANGE, "--"),
                            Node(Token.VARIABLE, "i")
                        )),
                    Node(Token.RIGHT_PARENTHESIS)
                )
            )
        )
        testThrowing(
            "for (int i = 0; i < 10; i+)",

        )
        testThrowing(
            "for (int i = 0; i < 10; -i)"
        )
    }
    @Test
    @Timeout(TIMEOUT)
    fun `Different conditions`() {
        testInput("for(int i = 0; 10 > i; i++)",
            Node("for statement",
                listOf(
                    Node(Token.FOR),
                    Node(Token.LEFT_PARENTHESIS),
                    Node("INIT",
                        listOf(
                            Node(Token.TYPE_DECLARATION, "int"),
                            Node(Token.VARIABLE, "i"),
                            Node("assign", Token.ASSIGN),
                            Node(Token.VALUE, "0")
                        )),
                    Node(Token.DELIMITER),
                    Node("COND",
                        listOf(
                            Node(Token.VALUE, "10"),
                            Node(Token.COMPARE, ">"),
                            Node(Token.VARIABLE, "i")
                        )),
                    Node(Token.DELIMITER),
                    Node("ITER",
                        listOf(
                            Node(Token.VARIABLE, "i"),
                            Node(Token.CHANGE, "++")
                        )),
                    Node(Token.RIGHT_PARENTHESIS)
                )
            )
        )
        testInput("for (int i = 0; 1 != i; i++)",
            Node("for statement",
                listOf(
                    Node(Token.FOR),
                    Node(Token.LEFT_PARENTHESIS),
                    Node("INIT",
                        listOf(
                            Node(Token.TYPE_DECLARATION, "int"),
                            Node(Token.VARIABLE, "i"),
                            Node("assign", Token.ASSIGN),
                            Node(Token.VALUE, "0")
                        )),
                    Node(Token.DELIMITER),
                    Node("COND",
                        listOf(
                            Node(Token.VALUE, "1"),
                            Node(Token.COMPARE, "!="),
                            Node(Token.VARIABLE, "i")
                        )),
                    Node(Token.DELIMITER),
                    Node("ITER",
                        listOf(
                            Node(Token.VARIABLE, "i"),
                            Node(Token.CHANGE, "++")
                        )),
                    Node(Token.RIGHT_PARENTHESIS)
                )
            )
        )
    }

    @Test
    @Timeout(TIMEOUT)
    fun `Different names`() {
        testInput("for (int i11 = 0; i11 < 10; i++)",
            Node("for statement",
                listOf(
                    Node(Token.FOR),
                    Node(Token.LEFT_PARENTHESIS),
                    Node("INIT",
                        listOf(
                            Node(Token.TYPE_DECLARATION, "int"),
                            Node(Token.VARIABLE, "i11"),
                            Node("assign", Token.ASSIGN),
                            Node(Token.VALUE, "0")
                        )),
                    Node(Token.DELIMITER),
                    Node("COND",
                        listOf(
                            Node(Token.VARIABLE, "i11"),
                            Node(Token.COMPARE, "<"),
                            Node(Token.VALUE, "10")
                        )),
                    Node(Token.DELIMITER),
                    Node("ITER",
                        listOf(
                            Node(Token.VARIABLE, "i"),
                            Node(Token.CHANGE, "++")
                        )),
                    Node(Token.RIGHT_PARENTHESIS)
                )
            )
        )
        testInput("for (int II = 0; II < 10; i++)",
            Node("for statement",
                listOf(
                    Node(Token.FOR),
                    Node(Token.LEFT_PARENTHESIS),
                    Node("INIT",
                        listOf(
                            Node(Token.TYPE_DECLARATION, "int"),
                            Node(Token.VARIABLE, "II"),
                            Node("assign", Token.ASSIGN),
                            Node(Token.VALUE, "0")
                        )),
                    Node(Token.DELIMITER),
                    Node("COND",
                        listOf(
                            Node(Token.VARIABLE, "II"),
                            Node(Token.COMPARE, "<"),
                            Node(Token.VALUE, "10")
                        )),
                    Node(Token.DELIMITER),
                    Node("ITER",
                        listOf(
                            Node(Token.VARIABLE, "i"),
                            Node(Token.CHANGE, "++")
                        )),
                    Node(Token.RIGHT_PARENTHESIS)
                )
            )
        )
        testInput("for(int f1f = 0; f1f < 10; f1f++)",
            Node("for statement",
                listOf(
                    Node(Token.FOR),
                    Node(Token.LEFT_PARENTHESIS),
                    Node("INIT",
                        listOf(
                            Node(Token.TYPE_DECLARATION, "int"),
                            Node(Token.VARIABLE, "f1f"),
                            Node("assign", Token.ASSIGN),
                            Node(Token.VALUE, "0")
                        )),
                    Node(Token.DELIMITER),
                    Node("COND",
                        listOf(
                            Node(Token.VARIABLE, "f1f"),
                            Node(Token.COMPARE, "<"),
                            Node(Token.VALUE, "10")
                        )),
                    Node(Token.DELIMITER),
                    Node("ITER",
                        listOf(
                            Node(Token.VARIABLE, "f1f"),
                            Node(Token.CHANGE, "++")
                        )),
                    Node(Token.RIGHT_PARENTHESIS)
                )
            )
        )

        testThrowing(
            "for (int 1 = 0; i < 10; i++)"
        )
        testThrowing(
            "for (int i = 0; 1 < 10; i++)"
        )
        testThrowing(
            "for (int i = 0; i < 10; 1++)"
        )

        testThrowing(
            "for (int i = 0; i < 10; ++1)"
        )
    }

    @Test
    @Timeout(TIMEOUT)
    fun `incorrect controls symbols`() {
        testThrowing(
            "fr (int i = 0; i < 10; i++)"
        )
        testThrowing(
            "for (int i = 0; i < 10; i++"
        )
        testThrowing(
            "for((int i = 0; i < 10; i++)"
        )

        testThrowing(
            "int(int i = 0; i < 10; i++)"
        )
    }

    @Test
    @Timeout(TIMEOUT)
    fun `missing delimiter`() {
        testThrowing(
            "for (int i = 0 i < 10; i++)"
        )
        testThrowing(
            "for (int i = 0; i < 10 i++)"
        )
    }

    @Test
    @Timeout(TIMEOUT)
    fun `additional controls symbols`() {
        testThrowing(
            "for(int int i = 0; i < 10; i++)"
        )
        testThrowing(
            "for(int i = 0; i << 10; i++)"
        )
    }


    private fun testThrowing(input: String) {
        assertThrows<Exception> {
            testInput(input)
        }
    }

    private fun testInput(input: String, actual: Node? = null) {
        assertEquals(actual, ForParser(ForLexer(input.reader())).parse())
    }
}

