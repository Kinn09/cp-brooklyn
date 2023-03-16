package com.okinkin09.kotlin.cp1.`cp-1`

data class Item(val id: Int, val name: Char)

fun main() {
    val n = readLine()!!.toInt() // read the number of test cases
    repeat(n) {
        val m = readLine()!!.toInt() // read the number of items in each test case
        val items = mutableListOf<Item>()
        repeat(m) {
            val (id, name) = readLine()!!.split(". ")
            items.add(Item(id.toInt(), name[0]))
        }
        // sort the items by their id in ascending order
        val sortedItems = items.sortedBy { it.id }
        // print the sorted items
        for (item in sortedItems) {
            println("${item.id}. ${item.name}")
        }
    }
}
