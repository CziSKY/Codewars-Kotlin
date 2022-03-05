package me.skymc.codewars.kotlin.sixkyu

@Suppress("SpellCheckingInspection")
object TribonacciSequence {

    fun tribonacci(signature: DoubleArray, n: Int): DoubleArray {
        val doubleNumList = ArrayList<Double>().apply {
            addAll(signature.toList())
        }
        var offset = 0
        while (doubleNumList.size < n) {
            doubleNumList += doubleNumList[offset] + doubleNumList[offset + 1] + doubleNumList[offset + 2]
            offset++
        }
        return doubleNumList.toDoubleArray()
    }
}