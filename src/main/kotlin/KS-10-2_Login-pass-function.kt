package org.example

fun main() {

    println("Введите логин:")
    val login = readln()

    println("Введите пароль:")
    val password = readln()

    dataValidation(login, password)
}

fun dataValidation (login: String, password: String) {
    when {
        (login.length >= 4) && (password.length >= 4) -> println("Добро пожаловать!")
        else -> println("Логин или пароль недостаточно длинные")
    }
}