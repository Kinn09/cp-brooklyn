package com.okinkin09.kotlin.cp1.`cp-4`

fun isPrime(num: Int, i: Int = 2): Boolean {
    if (num <= 2) {
        return num == 2
    }
    if (num % i == 0) {
        return false
    }
    if (i * i > num) {
        return true
    }
    return isPrime(num, i + 1)
}

fun reverse(num: Int): Int {
    var n = num
    var reversed = 0
    while (n > 0) {
        reversed = reversed * 10 + n % 10
        n /= 10
    }
    return reversed
}

fun isEmirp(num: Int): Boolean {
    val reversedNum = reverse(num)
    return num != reversedNum && isPrime(num) && isPrime(reversedNum)
}

fun main() {
    print("Masukkan nilai batas atas: ")
    val max = readLine()!!.toInt()

    for (i in 1..max) {
        if (isEmirp(i)) {
            println("$i is emirp number ")
        } else if (isPrime(i)) {
            println("$i is prime number ")
        } else {
            println("$i is not a prime number")
        }
    }
}
