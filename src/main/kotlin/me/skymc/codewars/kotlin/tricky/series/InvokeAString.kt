package me.skymc.codewars.kotlin.tricky.series

object InvokeAString {

    @JvmStatic
    fun main(arg: Array<String>) {
        println("calling function by a string!"("bump"))
    }

    // That's fascinating...
    // At first, i only concerned about String type, But it throws exception to types.
    // so by changed some codes, it works now.
    operator fun <T> String.invoke(s: T) = s
}