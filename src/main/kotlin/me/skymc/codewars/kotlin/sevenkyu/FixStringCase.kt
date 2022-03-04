package me.skymc.codewars.kotlin.sevenkyu

object FixStringCase {

    fun solve(s: String): String {
        if (s.isEmpty()) return s
        val upperCaseCharSize = s.count { it.isUpperCase() }
        val lowerCaseCharSize = s.count { it.isLowerCase() }
        if (upperCaseCharSize > lowerCaseCharSize) {
            return goUpper(s)
        }
        return goLower(s)
    }

    private fun goUpper(s: String) = s.uppercase()

    private fun goLower(s: String) = s.lowercase()
}