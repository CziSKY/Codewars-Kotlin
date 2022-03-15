package me.skymc.codewars.kotlin.sixkyu

object EqualSidesOfAnArray {

    @JvmStatic
    fun main(args: Array<String>) {
    }

    fun findEvenIndex(arr: IntArray): Int {
        var leftSum = 0
        var totalSum = arr.sum()
        for (index in 1 until arr.size) {
            totalSum -= arr[index]
            if (leftSum == totalSum) {
                return index
            }
            leftSum += arr[index]
        }
        return -1
    }
}