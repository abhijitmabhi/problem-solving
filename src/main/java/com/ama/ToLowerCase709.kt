package com.ama

fun main() {
    println(toLowerCase("Hello"))
}

fun toLowerCase(s: String): String {
    val result = StringBuilder()

    for (char in s) {
        when {
            char in 'A'..'Z' -> result.append(char + 32)
            else -> result.append(char)
        }
    }

    return result.toString()
}