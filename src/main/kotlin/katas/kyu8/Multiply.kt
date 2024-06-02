package dev.janku.learn.kotlincodewars.katas.kyu8

import kotlin.math.absoluteValue
import kotlin.math.pow

/**
 * Multiply the number with 5 to the power of the number digits
 *
 * @param int number to multiply
 * return int multiplied number
 */
fun Katas8kyu.Companion.multiplyDigitsPowered5(int: Int) : Int {
    val digits = int.absoluteValue.toString().length
    return int * (5.toDouble().pow(digits)).toInt()
}