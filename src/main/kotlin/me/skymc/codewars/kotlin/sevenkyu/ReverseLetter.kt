package me.skymc.codewars.kotlin.sevenkyu

object ReverseLetter {

    fun reverseLetter(str: String): String {
        val regex = Regex("[^a-z A-Z']")
        val patternStr = regex.replace(str, "")
        return patternStr.replace(" ", "").reversed()
    }
}