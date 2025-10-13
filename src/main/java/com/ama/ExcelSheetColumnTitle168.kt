package com.ama

fun main() {
    println(convertToTitle(701))
}

fun convertToTitle(columnNumber: Int): String {
    var num = columnNumber
    val result = StringBuilder()

    while (num > 0) {
        num--
        result.insert(0, ('A' + (num % 26)))
        num /= 26
    }

    return result.toString()
}