package me.skymc.codewars.kotlin.fourkyu

object StripComments {

    fun solution(input: String, markers: CharArray): String {
        val split = input.split("\n")
        val toReturn = split.map { it.replaceWithMarker(markers) }
        return toReturn.joinToString("\n")
    }

    private fun String.replaceWithMarker(markers: CharArray): String {
        markers.forEach { marker ->
            forEachIndexed { index, c ->
                if (c == marker) {
                    return substring(0, index - 1).trim()
                }
            }
        }
        return this
    }
}