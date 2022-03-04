@file:Suppress("PackageName")

package me.skymc.codewars.kotlin.`7kyu`

object ShortestWord {

    fun findShort(s: String) = s.split(" ").map { it.length }.minOf { it }
}
