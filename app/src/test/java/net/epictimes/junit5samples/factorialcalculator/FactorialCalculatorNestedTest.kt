package net.epictimes.junit5samples.factorialcalculator

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import java.math.BigInteger

internal class FactorialCalculatorNestedTest {

    private val calculator = FactorialCalculator()

    @DisplayName("given small n value")
    @Nested
    inner class GivenSmallNValue {

        @Test
        fun `should return correct factorial`() {
            assertEquals(BigInteger.ONE, calculator.calculate(1))
        }
    }

    @DisplayName("given large n value")
    @Nested
    inner class GivenLargeNValue {

        @Test
        fun `should return correct factorial`() {
            val n = 45
            val expected = BigInteger("119622220865480194561963161495657715064383733760000000000")

            assertEquals(expected, calculator.calculate(n))
        }
    }
}