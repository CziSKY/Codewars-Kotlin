package me.skymc.codewars.kotlin.eightkyu

object SumMixedArray {

    fun sum(mixed: List<Any>): Int {
        return mixed.sumOf { it.toString().toInt() }
    }
}