package katas.kyu8

import dev.janku.learn.kotlincodewars.katas.kyu8.Katas8kyu
import dev.janku.learn.kotlincodewars.katas.kyu8.invert

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertContentEquals

class InvertValueTest {

    companion object {
        @JvmStatic
        fun invertTestParams() = listOf(
            Arguments.of(intArrayOf(1, 2, 3, 4, 5), intArrayOf(-1, -2, -3, -4, -5)),
            Arguments.of(intArrayOf(1, -2, 3, -4, 5), intArrayOf(-1, 2, -3, 4, -5)),
            Arguments.of(intArrayOf(0), intArrayOf(0)),
            Arguments.of(intArrayOf(), intArrayOf())
        )
    }

    @ParameterizedTest(name = "invert({0}) should be {1}")
    @MethodSource("invertTestParams")
    fun `given array returns array of same size with inverted values`(array : IntArray, expectedArray : IntArray) {
        assertContentEquals(expectedArray, Katas8kyu.invert(array))
    }

}