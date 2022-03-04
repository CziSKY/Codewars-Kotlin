package me.skymc.codewars.kotlin.sevenkyu

object ShortestWord {

    fun findShort(s: String) = s.split(" ").map { it.length }.minOf { it }
}
