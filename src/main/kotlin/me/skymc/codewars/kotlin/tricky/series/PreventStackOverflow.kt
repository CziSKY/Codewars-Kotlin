package me.skymc.codewars.kotlin.tricky.series

import kotlin.random.Random

object PreventStackOverflow {

    @JvmStatic
    fun main(args: Array<String>) {
        repeat(99999) {
            loop(Random, 99999)
        }
    }

    private tailrec fun loop(random: Random, int: Int): Int {
        return if (int <= 0) random.nextInt()
        else {
            random.nextInt()
            loop(random, int - 1)
        }
    }
}