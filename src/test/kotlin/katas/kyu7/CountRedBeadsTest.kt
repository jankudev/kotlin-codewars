package katas.kyu7

import dev.janku.learn.kotlincodewars.katas.kyu7.Katas7kyu
import dev.janku.learn.kotlincodewars.katas.kyu7.countRedBeads
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class CountRedBeadsTest {
    companion object {
        @JvmStatic
        fun countRedBeadsTestParams() = listOf(
            Arguments.of(0, 0),
            Arguments.of(1, 0),
            Arguments.of(3, 4),
            Arguments.of(5, 8),
            Arguments.of(0, 0)
        )
    }

    @ParameterizedTest(name = "countRedBeads({0}) should be {1}")
    @MethodSource("countRedBeadsTestParams")
    fun `given number of blue beads return number of red beads`(nBlue: Int, expected: Int) {
        assertEquals(expected, Katas7kyu.countRedBeads(nBlue))
    }
}