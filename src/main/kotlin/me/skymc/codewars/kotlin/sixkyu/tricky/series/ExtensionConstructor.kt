package me.skymc.codewars.kotlin.sixkyu.tricky.series

object ExtensionConstructor {

    operator fun Int.Companion.invoke(str: String) = str.toInt()

    operator fun Long.Companion.invoke(str: String): Long = str.toLong()

    operator fun Double.Companion.invoke(str: String): Double = str.toDouble()
}