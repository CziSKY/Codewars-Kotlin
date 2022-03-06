package me.skymc.codewars.kotlin.eightkyu

object ReversedArrayOfDigits {

    fun digitize(n: Long) = n.toString()
        .map { it.digitToInt() }
        .reversed()
        .toIntArray()
}