@file:Suppress("PackageName")

package me.skymc.codewars.kotlin.`8kyu`

object CountOfPositivesAndSumOfNegatives {

    fun countPositivesSumNegatives(input: Array<Int>?): Array<Int> {
        if (input == null || input.isEmpty()) {
            return emptyArray()
        }
        val sizeOfPositiveNum = input.count { it > 0 }
        val sizeOfNegativeNum = input.filter { it < 0 }.sum()
        return arrayOf(sizeOfPositiveNum, sizeOfNegativeNum)
    }
}