package dev.janku.learn.kotlincodewars.katas.kyu7

/**
 * Alternate character capitalization returning 2 transformed strings
 * 1st string with all even indexed characters in uppercase
 * 2nd string with all odd indexed characters in uppercase
 *
 * @param text the text to transform
 * @return a list of 2 strings with alternate capitalization
 */
fun Katas7kyu.Companion.alternateCapilitalization(text: String): List<String> {
    val oddCharsCapitalized = text.mapIndexed { index, char ->
        if (index % 2 == 0) char.uppercaseChar() else char
    }.joinToString("")
    val evenCharsCapitalized = text.mapIndexed { index, char ->
        if (index % 2 == 1) char.uppercaseChar() else char
    }.joinToString("")

    return listOf(oddCharsCapitalized, evenCharsCapitalized)
}