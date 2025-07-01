package org.example

fun main() {
    val luckyNumber = (1..9).random()
    println(luckyNumber)

    var counter = 5

    println("Попробуй угадать число:")

    while (counter > 0) {
        val userGuess = readln().toInt()

        if (luckyNumber == userGuess) {
            println("Это была великолепная игра!")
            break
        } else {
            counter--
            if (counter > 0) {
                println("Неверно! Осталось попыток $counter. Введите новое число:")
            } else {
                println("Попытки закончились. Было загадано число $luckyNumber")
            }
        }
    }
}

