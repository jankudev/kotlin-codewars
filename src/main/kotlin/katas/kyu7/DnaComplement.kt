package dev.janku.learn.kotlincodewars.katas.kyu7

/**
 * Complement the DNA sequence
 *
 * @param dna DNA sequence
 * @return DNA sequence with replaced A complements T, C complements G

 */
fun Katas7kyu.Companion.dnaComplement(dna: String): String {
    return dna.map { c -> when(c) {
        'A' -> 'T'
        'T' -> 'A'
        'C' -> 'G'
        'G' -> 'C'
        else -> throw IllegalArgumentException("Invalid DNA sequence, contains ${c} in ${dna}")
    }
    }.joinToString("")
}