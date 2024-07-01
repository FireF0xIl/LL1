package calculatorPackage

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Timeout

class CalculatorParseTests {
    companion object {
        const val TIMEOUT = 5L
    }

    @Test
    @Timeout(TIMEOUT)
    fun `Sample test`() {
        testInput("1 + 2", 3)
        testInput("1 + 2 + 3", 6)
        testInput("1 + 2 * 3", 7)
        testInput("1 * 2 + 3", 5)
        testInput("6 / 3", 2)
    }


    @Test
    @Timeout(TIMEOUT)
    fun `different whitespaces`() {
        testInput("   1 +   2", 3)
        testInput("1 + 2   ", 3)
        testInput("   1 + 2   ", 3)
    }

    @Test
    @Timeout(TIMEOUT)
    fun `more tests`() {
        testInput("1 + 2 * 3 + 4", 11)
        testInput("1 * 2 + 3 * 4", 14)
        testInput("1 * 2 + 3 - 3 - 5", -3)
        testInput("1 * 2 + 3 - 3 - 5 * 2", -8)
        testInput("1 * 2 - 5 * 2 / 2", -3)

    }


    private fun testInput(input: String, actual: Int) {
        assertEquals(actual, CalculatorParser(CalculatorLexer(input.reader())).parse())
    }
}

