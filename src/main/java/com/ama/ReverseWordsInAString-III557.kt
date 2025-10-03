package com.ama

fun main() {
    println(reverseWords("Let's take LeetCode contest"))
}

fun reverseWords(s: String): String {
    val words = s.split(" ").toMutableList()

    for (i in 0 until words.size) {
        val word = words[i]
        words[i] = word.reversed()
        println("word: $word")
    }

    return words.joinToString(" ")
}