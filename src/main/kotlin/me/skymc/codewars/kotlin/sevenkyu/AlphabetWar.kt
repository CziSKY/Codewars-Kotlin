package me.skymc.codewars.kotlin.sevenkyu

object AlphabetWar {

    private val leftPowerMap = mutableMapOf(Pair('w', 4), Pair('p', 3), Pair('b', 2), Pair('s', 1))

    private val rightPowerMap = mutableMapOf(Pair('m', 4), Pair('q', 3), Pair('d', 2), Pair('z', 1))

    fun alphabetWar(fight: String): String {
        var leftCounts = 0
        var rightCounts = 0
        fight.forEach {
            if (leftPowerMap.keys.contains(it)) {
                leftCounts += leftPowerMap[it]!!
            }
            if (rightPowerMap.keys.contains(it)) {
                rightCounts += rightPowerMap[it]!!
            }
        }
        return when {
            leftCounts == rightCounts -> "Let's fight again!"
            leftCounts > rightCounts -> "Left side wins!"
            else -> "Right side wins!"
        }
    }
}