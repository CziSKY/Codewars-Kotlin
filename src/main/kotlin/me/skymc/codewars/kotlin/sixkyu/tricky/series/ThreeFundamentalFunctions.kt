package me.skymc.codewars.kotlin.sixkyu.tricky.series

object ThreeFundamentalFunctions {

    // I failed that, still need more practices :(
    // btw, here's solutions by after watching others people I rewrite it.
    // func() == func.invoke(), remembered that.

    @JvmStatic
    fun main(args: Array<String>) {
    }

    inline fun until(func: () -> Boolean, func1: () -> Unit) {
        while (!func.invoke()) {
            func1.invoke()
        }
    }

    inline fun unless(bool: Boolean, func: () -> Unit) {
        if (!bool) {
            func.invoke()
        }
    }

    inline fun forceRun(func: () -> Unit) {
        try {
            func.invoke()
        } catch (ignored: Exception) {
        }
    }
}