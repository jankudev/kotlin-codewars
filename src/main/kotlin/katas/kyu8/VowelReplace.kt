package dev.janku.learn.kotlincodewars.katas.kyu8

fun Katas8kyu.Companion.vowelReplace(s: String, c: Char): String {
    return s.replace(Regex("[aeiou]", RegexOption.IGNORE_CASE ), c.toString())
}