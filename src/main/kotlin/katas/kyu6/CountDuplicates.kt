package dev.janku.learn.kotlincodewars.katas.kyu6

/**
 * Count the number of duplicated letters case-insensitive in the given text
 *
 * @param text the text to count the duplicates in
 * @return the number of duplicated letters
 */
fun Katas6kyu.Companion.countDuplicates(text: String): Int {
    return text
        .groupBy(Char::lowercaseChar)
        .count { it.value.count() > 1 }
}