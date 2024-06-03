package katas.kyu7

import dev.janku.learn.kotlincodewars.katas.kyu7.Katas7kyu
import dev.janku.learn.kotlincodewars.katas.kyu7.alternateCapilitalization
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class AlternateCapitalizationTest {
    companion object {
        @JvmStatic
        fun alternateCapitalizationTestParams() = listOf(
            Arguments.of("abcdef", listOf("AbCdEf", "aBcDeF")),
            Arguments.of("codewars", listOf("CoDeWaRs", "cOdEwArS")),
            Arguments.of("abracadabra", listOf("AbRaCaDaBrA", "aBrAcAdAbRa")),
            Arguments.of("codewarriors", listOf("CoDeWaRrIoRs", "cOdEwArRiOrS"))
        )
    }

    @ParameterizedTest(name = "alternateCapitalization({0}) should be {1}")
    @MethodSource("alternateCapitalizationTestParams")
    fun `given text return 2 strings with alternate capitalization, 1st with odd chars capitalized, 2nd with even chars capitalized`(
        text: String,
        expected: List<String>
    ) {
        assertEquals(expected, Katas7kyu.alternateCapilitalization(text))
    }
}