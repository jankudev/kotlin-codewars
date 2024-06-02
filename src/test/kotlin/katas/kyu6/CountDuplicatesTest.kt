package katas.kyu6

import dev.janku.learn.kotlincodewars.katas.kyu6.Katas6kyu
import dev.janku.learn.kotlincodewars.katas.kyu6.countDuplicates
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class CountDuplicatesTest {
    companion object {

        @JvmStatic
        fun countDuplicatesTestParams() = listOf(
            Arguments.of("abcde", 0),
            Arguments.of("abcdea", 1),
            Arguments.of("indivisibility", 1),
            Arguments.of("dA" + "c".repeat(10) + "b".repeat(100) + "a".repeat(1000), 3)
        )
    }

    @ParameterizedTest(name = "countDuplicates({0}) should be {1}")
    @MethodSource("countDuplicatesTestParams")
    fun `given string return number of duplicate letters case insensitive`(text: String, expected: Int) {
        assertEquals(expected, Katas6kyu.countDuplicates(text))
    }
}