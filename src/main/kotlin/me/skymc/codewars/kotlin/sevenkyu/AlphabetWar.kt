package me.skymc.codewars.kotlin.sevenkyu

object AlphabetWar {

    private val leftPowerMap = mutableMapOf('w' to 4, 'p' to 3, 'b' to 2, 's' to 1)

    private val rightPowerMap = mutableMapOf('m' to 4, 'q' to 3, 'd' to 2, 'z' to 1)

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