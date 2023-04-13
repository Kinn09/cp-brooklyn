package com.okinkin09.kotlin.cp1.`cp-4`

fun main() {
    val n = readLine()!!.toInt()
    repeat(n) {
        val num = readLine()!!.toInt()
        val digits = num.toString().map { it.toString().toInt() }
        var count1 = 0
        var count2 = 0
        for (digit in digits) {
            if (digit != 0 && num % digit == 0) {
                count1++
            }
            if (digit != 0 && num % digit != 0) {
                count2++
            }
        }
        println("$count1 $count2")
    }
}