package me.skymc.codewars.kotlin.sixkyu

object CountingDuplicates {

    fun duplicateCount(text: String): Int {
        val countMap = HashMap<Char, Int>()
        text.forEach {
            val lowerCaseChar = it.lowercaseChar()
            if (countMap[lowerCaseChar] == null) {
                countMap[lowerCaseChar] = 1
            } else {
                countMap[lowerCaseChar] = countMap[lowerCaseChar]!! + 1
            }
        }
        return countMap.count { it.value > 1 }
    }
}