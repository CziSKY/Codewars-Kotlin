package me.skymc.codewars.kotlin.sixkyu

import kotlin.math.log

object BouncingBalls {

    @JvmStatic
    fun main(args: Array<String>) {
        println(bouncingBall(30.0, 0.66, 1.5))
    }

    fun bouncingBall(h: Double, bounce: Double, window: Double): Int {
        if (h <= 0 || bounce >= 1.0 || bounce <= 0 || window >= h) {
            return -1
        }
        return log((window + 0.001) / h, bounce).toInt() * 2 + 1
    }
}