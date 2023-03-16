package com.okinkin09.kotlin.cp1.`cp-2`
fun main() {
    print("Masukkan kalimat: ")
    val kalimat = readLine()!!
    val Kalimat = kalimat.replace("\"", "' '")
    println(Kalimat)
}