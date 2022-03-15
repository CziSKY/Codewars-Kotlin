package me.skymc.codewars.kotlin.fivekyu

@Suppress("SpellCheckingInspection")
object RGBToHexConversion {

    @JvmStatic
    fun main(args: Array<String>) {
        println(rgb(11, 11, 11))
    }

    fun rgb(r: Int, g: Int, b: Int) = r.toHexStr() + g.toHexStr() + b.toHexStr()

    fun Int.toHexStr(): String {
        if (this < 0) {
            return "00"
        }
        if (this > 255) {
            return "FF"
        }
        var toReturn = Integer.toHexString(this)
        if (toReturn.length < 2) {
            toReturn = "0$toReturn"
        }
        return toReturn.uppercase()
    }
}