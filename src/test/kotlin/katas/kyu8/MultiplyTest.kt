package katas.kyu8

import dev.janku.learn.kotlincodewars.katas.kyu8.Katas8kyu
import dev.janku.learn.kotlincodewars.katas.kyu8.multiplyDigitsPowered5
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class MultiplyTest {
    companion object {
        @JvmStatic
        fun multiplyTestParams() = listOf(
            Arguments.of(0, 0),
            Arguments.of(5, 25),
            Arguments.of(10, 250),
            Arguments.of(200, 25000),
            Arguments.of(-2, -10)
        )
    }

    @ParameterizedTest(name = "multiplyDigitsPowered5({0}) should be {1}")
    @MethodSource("multiplyTestParams")
    fun `given number return it multiplied by 5 to the power of its digits (parametrized)`(
        number: Int, expected: Int
    ) {
        assertEquals(expected, Katas8kyu.multiplyDigitsPowered5(number))
    }
}
