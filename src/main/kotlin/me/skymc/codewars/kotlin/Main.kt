package me.skymc.codewars.kotlin

import me.skymc.codewars.kotlin.sixkyu.TribonacciSequence.tribonacci

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        println(tribonacci(doubleArrayOf(1.0, 1.0, 1.0), 10).contentToString())
    }
}