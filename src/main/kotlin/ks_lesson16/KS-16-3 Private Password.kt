package org.kotlin.sprint.ks_lesson16

class User(
    val login: String,
    private val password: String,
) {
    fun validatePassword(enteredPassword: String) {
        if (enteredPassword == password) {
            println("Пароль введен верно!")
        } else {
            println("Некорректный пароль или ввод")
        }
    }
}

fun main() {
    val user1 = User(login = "super1990", password = "qwerty")

    println("Введите пароль:")
    val enteredPassword = readln().trim()

    user1.validatePassword(enteredPassword)
}