package org.example

fun main() {
    println("Введите любое число:")
    val anyNumber = readln().toInt()

    val numbersRange = 0..anyNumber

    for (i in numbersRange step 2) {
        print("$i ")
    }
}