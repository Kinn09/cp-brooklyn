package com.okinkin09.kotlin.cp1.`cp-4`

import java.util.*

fun getNumBits(n: Int): Int {
    var count = 0
    var num = n
    while (num != 0) {
        count += num and 1
        num = num shr 1
    }
    return count
}

fun main() {
    val scanner = Scanner(System.`in`)
    val T = scanner.nextInt()
    repeat(T) {
        val n = scanner.nextInt()
        val x1 = getNumBits(n)
        var x2 = 0
        var num = n
        while (num != 0) {
            x2 += getNumBits(num % 10)
            num /= 10
        }
        println("$x1 $x2")
        }
}