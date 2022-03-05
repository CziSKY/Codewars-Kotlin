package me.skymc.codewars.kotlin.sevenkyu

object GetTheMiddleCharacter {

    fun getMiddle(word: String): String {
        val position: Int
        val length: Int
        if (word.length % 2 == 0) {
            position = word.length / 2 - 1
            length = 2
        } else {
            position = word.length / 2
            length = 1
        }
        return word.substring(position, position + length)
    }
}