@file:Suppress("PackageName")

package me.skymc.codewars.kotlin.`7kyu`

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