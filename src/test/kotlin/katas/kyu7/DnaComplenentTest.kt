package katas.kyu7

import dev.janku.learn.kotlincodewars.katas.kyu7.Katas7kyu
import dev.janku.learn.kotlincodewars.katas.kyu7.dnaComplement
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class DnaComplenentTest {
    companion object {
        @JvmStatic
        fun dnaComplementTestParams() = listOf(
            Arguments.of("AAAA", "TTTT"),
            Arguments.of("ATTGC", "TAACG")
        )
    }

    @ParameterizedTest(name = "dnaComplement({0}) should be {1}")
    @MethodSource("dnaComplementTestParams")
    fun `given dna string return its complement`(dna: String, expected: String) {
        assertEquals(expected, Katas7kyu.dnaComplement(dna))
    }

    @Test
    fun `given bad DNA sequence throws IllegalArgumentException`() {
        val dna = "ATTGCBAATTT"
        assertThrows<IllegalArgumentException> { Katas7kyu.dnaComplement(dna) }
    }
}