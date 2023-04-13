package com.okinkin09.kotlin.cp1.`cp-4`

fun main() {
    val m = readLine()!!.toInt()
    repeat(m) {
        val num = readLine()!!.toInt()
        val digits = num.toString().map { it.toString().toInt() }
        var count = 0
        var count1 = 0
        for (digit in digits) {
            if (digit != 0 && num % digit == 0) {
                count++
            }
            if (digit != 0 && num % digit != 0) {
                count1++
            }
        }
        println("$count $count1")
    }
}