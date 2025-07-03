package org.example.KS_Lesson7

fun main() {
    do {
        val smsCode = (1000..9999).random()
        println("Ваш код авторизации: $smsCode.")

        println("Введите код, полученный по СМС: ")
        val confirmedCode = readln().toInt()
    } while (smsCode != confirmedCode)

    println("Добро пожаловать!")
}