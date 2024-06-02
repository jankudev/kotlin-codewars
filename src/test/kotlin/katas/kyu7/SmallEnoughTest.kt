package katas.kyu7

import dev.janku.learn.kotlincodewars.katas.kyu7.Katas7kyu
import dev.janku.learn.kotlincodewars.katas.kyu7.smallEnough
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class SmallEnoughTest {
    companion object {
        @JvmStatic
        fun smallEnoughTestParams() = listOf(
            // array, limit, expected result
            Arguments.of(intArrayOf(66, 101), 200, true),
            Arguments.of(intArrayOf(78, 117, 110, 99, 104, 117, 107, 115), 100, false),
            Arguments.of(intArrayOf(101, 45, 75, 105, 99, 107), 107, true),
            Arguments.of(intArrayOf(80, 117, 115, 104, 45, 85, 112, 115), 120, true)
        )
    }

    @ParameterizedTest(name = "smallEnough({0}) should be {1}")
    @MethodSource("smallEnoughTestParams")
    fun `given array should return true if all elements are below or equal the limit, false otherwise`(
        array: IntArray,
        limit: Int,
        expected: Boolean
    ) {
        assertEquals(expected, Katas7kyu.smallEnough(array, limit))
    }
}