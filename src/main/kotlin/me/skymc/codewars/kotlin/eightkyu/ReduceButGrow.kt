package me.skymc.codewars.kotlin.eightkyu

object ReduceButGrow {

    fun grow(arr: IntArray) = arr.reduce { a, b -> a * b }
}