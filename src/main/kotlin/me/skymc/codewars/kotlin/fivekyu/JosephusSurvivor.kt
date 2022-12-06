package me.skymc.codewars.kotlin.fivekyu

object JosephusSurvivor {

    @JvmStatic
    fun main(vararg args: String) {
        josephusSurvivor(7, 3)
    }

    fun josephusSurvivor(n: Int, k: Int): Int {
        val peoples = (1..n).toMutableList()
        println(doJosephus(peoples, 3, 0))
        return 0
    }

    private fun doJosephus(list: MutableList<Int>, k: Int, startAt: Int): Int {
        var index = k + startAt
        if (index > list.size) {
            index -= list.size
            index++
        }
        println("remove $index")
        val nextStartAt = list.indexOf(index)
        list.removeAt(index - 1)
        println("startAt: $nextStartAt")
        println("list = $list")

        if (list.size != 1) {
            return doJosephus(list, k, nextStartAt)
        }
        return list[0]
    }
}