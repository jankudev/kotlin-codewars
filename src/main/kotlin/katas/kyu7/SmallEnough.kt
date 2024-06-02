package dev.janku.learn.kotlincodewars.katas.kyu7

/**
 * Check if all elements in the array are less than or equal to the limit
 */
fun Katas7kyu.Companion.smallEnough(a: IntArray, limit: Int): Boolean = a.none { it > limit }