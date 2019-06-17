package net.epictimes.junit5samples.factorialcalculator

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.math.BigInteger
import java.util.stream.Stream

internal class FactorialCalculatorMethodSourceWithJava8TargetTest {

    private val calculator = FactorialCalculator()

    @ParameterizedTest
    @MethodSource("arguments")
    fun `given n input should return the correct factorial`(n: Int, expected: BigInteger) {
        val actual = calculator.calculate(n)

        assertEquals(expected, actual)
    }

    private companion object {

        @JvmStatic
        fun arguments() =
            Stream.of(
                Arguments.of(1, BigInteger.ONE),
                Arguments.of(2, 2.toBigInteger()),
                Arguments.of(3, 6.toBigInteger()),
                Arguments.of(4, 24.toBigInteger()),
                Arguments.of(10, 3628800.toBigInteger()),
                Arguments.of(25, BigInteger("15511210043330985984000000")),
                Arguments.of(45, BigInteger("119622220865480194561963161495657715064383733760000000000"))
            )
    }
}