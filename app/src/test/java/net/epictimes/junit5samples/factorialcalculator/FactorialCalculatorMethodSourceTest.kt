package net.epictimes.junit5samples.factorialcalculator

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import java.math.BigInteger
import java.util.Arrays

internal class FactorialCalculatorMethodSourceTest {

    private val calculator = FactorialCalculator()

    @ParameterizedTest
    @MethodSource("arguments")
    fun `given n input should return the correct factorial`(arguments: TestArguments) {
        val actual = calculator.calculate(arguments.n)

        assertEquals(arguments.expected, actual)
    }

    private companion object {
        @JvmStatic
        fun arguments() =
            Arrays.stream(
                arrayOf(
                    TestArguments(1, BigInteger.ONE),
                    TestArguments(2, 2.toBigInteger()),
                    TestArguments(3, 6.toBigInteger()),
                    TestArguments(4, 24.toBigInteger()),
                    TestArguments(10, 3628800.toBigInteger()),
                    TestArguments(25, BigInteger("15511210043330985984000000")),
                    TestArguments(45, BigInteger("119622220865480194561963161495657715064383733760000000000"))
                )
            )
    }

    data class TestArguments(
        val n: Int,
        val expected: BigInteger
    )
}