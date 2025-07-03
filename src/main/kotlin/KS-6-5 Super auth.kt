package org.example

fun main() {

    var counter = 0

    while (counter < 3 )  {
        val firstNumber = (1..9).random()
        val secondNumber = (1..9).random()
        val summNumbers = firstNumber + secondNumber

        println("Докажи, что ты не робот! Сколько будет $firstNumber + $secondNumber?")
        val userAnswer = readln().toInt()

        if (summNumbers == userAnswer) {
            println("Добро пожаловать!")
            break
        } else if (counter < 2) {
            counter++
        } else {
            println("Доступ запрещен.")
            break
        }
    }
}