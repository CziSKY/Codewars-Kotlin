package me.skymc.codewars.kotlin.fourkyu

object FrequentlyUsedWords {

    @JvmStatic
    fun main(args: Array<String>) {
        top3("a a a  b  c c  d d d d  e e e e e")
        top3("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e")
        top3("  //wont won't won't ")
    }

    private val availableChars = ('a'..'z') + ('A'..'Z')

    fun top3(s: String): List<String> {
        val wordCounts = mutableMapOf<String, Int>()
        s.apply {
            this.split(" ")
                .filter { it.any { char -> availableChars.contains(char) } }
                .map { it.replaceAvailableChars() }
                .forEach {
                    val counts = wordCounts[it]
                    if (counts == null) {
                        wordCounts[it] = 1
                        return@forEach
                    }
                    wordCounts[it] = counts + 1
                }
        }
        val entries = wordCounts.toList()
            .sortedByDescending { it.second }
            .map { it.first }
            .take(3)
        println(entries)
        return emptyList()
    }

    private fun String.replaceAvailableChars(): String {
        return filter { availableChars.contains(it) && it != '\'' }
    }
}