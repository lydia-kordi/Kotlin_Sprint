package org.example

fun main() {
    println("Супер-лотерея, только сегодня! Угадай три числа от 0 до 42 и получи джек-пот!")

    val firstAutoNumber = (0..42).random()
    val secondAutoNumber = (0..42).random()
    val thirdAutoNumber = (0..42).random()

    val autoNumbers = listOf(firstAutoNumber, secondAutoNumber, thirdAutoNumber)

    println("Придумай первое число: ")
    val firstUserNumber = readln().toInt()

    println("Придумай второе число: ")
    val secondUserNumber = readln().toInt()

    println("Придумай третье число: ")
    val thirdUserNumber = readln().toInt()

    val userNumbers = listOf(firstUserNumber, secondUserNumber, thirdUserNumber)

    val commonNumbers = autoNumbers.intersect(userNumbers)
    val numberOfNumbers = commonNumbers.size

    println("")
    println("Мы задагадали числа: $autoNumbers")
    println("Ты придумал: $userNumbers")
    println("Количество совпадений: $numberOfNumbers!")
    println("")

    when(numberOfNumbers) {
        3 -> println("Поздравляю! Джек-пот твой!")
        2 -> println("Почти угадал, получишь крупный приз!")
        1 -> println("Ты пытался! Утешительный приз достается тебе!")
        else -> println("Штош, пусть удача сопутствует тебе в другой раз!")
    }
}