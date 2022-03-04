package me.skymc.codewars.kotlin.eightkyu

object ReversedSequence {

    fun reverseSeq(n: Int): List<Int> {
        val toReturn = arrayListOf<Int>()
        for (index in 1..n) {
            toReturn += index
        }
        return toReturn.reversed()
    }
}