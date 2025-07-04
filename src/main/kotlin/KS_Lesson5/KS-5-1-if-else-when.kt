package org.example.KS_Lesson5

import kotlin.random.Random

fun main() {
    val firstNumber = Random.nextInt(0, 20)
    val secondNumber = Random.nextInt(0, 20)
    val twoCalculated = firstNumber + secondNumber

    println("Докажи, что ты не робот! Сколько будет $firstNumber + $secondNumber?")
    println("Твой ответ: ")

    val userAnswer = readln().toInt()

    if (userAnswer == twoCalculated) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}