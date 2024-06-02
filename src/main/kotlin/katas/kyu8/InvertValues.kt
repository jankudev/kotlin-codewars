package dev.janku.learn.kotlincodewars.katas.kyu8

/**
 * Invert the values of and intArray
 *
 * @param arr intArray
 * @return intArray with inverted values
 */
fun Katas8kyu.Companion.invert(arr: IntArray): IntArray {
    return arr.map { -it }.toIntArray()
}
