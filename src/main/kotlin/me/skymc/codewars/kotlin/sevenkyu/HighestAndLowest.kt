package me.skymc.codewars.kotlin.sevenkyu

object HighestAndLowest {

    fun highAndLow(numbers: String): String {
        val sorted = numbers.split(" ").map { it.toInt() }.sorted()
        return "${sorted.last()} ${sorted.first()}"
    }
}