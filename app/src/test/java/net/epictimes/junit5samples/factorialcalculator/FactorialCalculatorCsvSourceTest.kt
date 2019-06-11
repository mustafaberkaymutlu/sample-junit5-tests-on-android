package net.epictimes.junit5samples.factorialcalculator

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import java.math.BigInteger

internal class FactorialCalculatorCsvSourceTest {

    private val calculator = FactorialCalculator()

    @ParameterizedTest(name = "{index} => n={0}, expected={1}")
    @CsvSource(
        "1, 1",
        "2, 2",
        "3, 6",
        "4, 24",
        "10, 3628800",
        "25, 15511210043330985984000000",
        "45, 119622220865480194561963161495657715064383733760000000000"
    )
    fun `given n input should return the correct factorial`(n: Int, expected: BigInteger) {
        val actual = calculator.calculate(n)

        assertEquals(expected, actual)
    }
}