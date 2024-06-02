package katas.kyu8

import dev.janku.learn.kotlincodewars.katas.kyu8.Katas8kyu
import dev.janku.learn.kotlincodewars.katas.kyu8.vowelReplace
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class VowelReplaceTest {
    companion object {

        val TEST_REPLACE_CHAR = '!'

        @JvmStatic
        fun vowelReplaceParams() = listOf(
            Arguments.of("Hi!", "H!!"),
            Arguments.of("!Hi! Hi!", "!H!! H!!"),
            Arguments.of("aeiou", "!!!!!"),
            Arguments.of("ABCDE", "!BCD!"),
        )
    }

    @ParameterizedTest(name = "vowelReplace({0}) should return {1}")
    @MethodSource("vowelReplaceParams")
    fun `given string return string with vowels replaced by !`(input: String, expected: String) {
        assertEquals(expected, Katas8kyu.vowelReplace(input, TEST_REPLACE_CHAR))
    }
}