package me.skymc.codewars.kotlin.eightkyu

object AbbreviateTwoWordName {

    fun abbrevName(name: String): String {
        val split = name.uppercase().split(" ")
        return "${split.first().first()}.${split.last().first()}"
    }
}