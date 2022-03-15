package me.skymc.codewars.kotlin.sixkyu.tricky.series

import kotlin.random.Random

object PreventStackOverflow {

    @JvmStatic
    fun main(args: Array<String>) {
        repeat(99999) {
            loop(Random, 99999)
        }
    }

    tailrec fun loop(random: Random, int: Int): Int {
        return if (int <= 0) random.nextInt()
        else {
            random.nextInt()
            loop(random, int - 1)
        }
    }
}