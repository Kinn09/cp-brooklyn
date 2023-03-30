package com.okinkin09.kotlin.cp1.`cp-2`

fun main() {
    val case = 2
    val a = 1
    val b = 5
    val c = 2
    val d = 5
    val ganjil = mutableListOf<Int>()
    val ganjil2 = mutableListOf<Int>()

    for (i in a..b) {
        if (i % 2 == 1) {
            ganjil.add(i)
        }
    }
    val hasil = ganjil.sum()

    println("jumlah case = $case")
    println("case 1 = $hasil")


    for (i in c..d) {
        if (i % 2 == 1) {
            ganjil2.add(i)
        }
    }
    val hasil2 = ganjil2.sum()

    println("case 2 = $hasil2")
}


