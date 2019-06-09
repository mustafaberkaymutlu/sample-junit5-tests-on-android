package net.epictimes.junit5samples.factorialcalculator

import java.math.BigInteger

/**
 * Calculates factorials.
 */
class FactorialCalculator {

    /**
     * @param n is in: 1 <= n <= 100
     */
    fun calculate(n: Int): BigInteger {
        if (n == 1) {
            return BigInteger.ONE
        }

        return n.toBigInteger() * calculate(n - 1)
    }
}