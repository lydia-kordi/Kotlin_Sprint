package org.example.KS_Lesson10

fun main() {
    println("Задайте длину пароля:")

    val passwordLength = readln().toInt()
    val newPassword =  passwordGeneration(passwordLength)

    printPassword(newPassword)
}

fun passwordGeneration (passwordLength: Int): String {
    val oddNumbers = 0..9
    val evenNumbers = "!\"#\$%&'()*+,-./ "

    var password = ""
    for (i in 0 until passwordLength) {
        if (i % 2 == 0) {
            password += oddNumbers.random()
        } else {
            password += evenNumbers.random()
        }
    }
    return password
}

fun printPassword (password: String) {
    println("Ваш пароль: $password")
}