package com.ama

fun main() {
    println(titleToNumber("AB"))
}

// res * 26 + currentChar
fun titleToNumber(columnTitle: String): Int {
    var result = 0
    for (i in columnTitle.indices) {
        result *= 26
        result += columnTitle[i] - 'A' + 1
    }

    return result
}