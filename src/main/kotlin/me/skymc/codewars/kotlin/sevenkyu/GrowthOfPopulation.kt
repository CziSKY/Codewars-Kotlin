package me.skymc.codewars.kotlin.sevenkyu

object GrowthOfPopulation {

    fun nbYear(pp0: Int, percent: Double, aug: Int, p: Int): Int {
        var peopleNum = pp0
        var counts = 0
        while (peopleNum < p) {
            counts++
            peopleNum += (peopleNum * percent / 100).toInt() + aug
        }
        return counts
    }
}