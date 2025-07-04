package org.example.KS_Lesson6

fun main() {
    println("Для регистрации в приложении придумайте логин и пароль.")

    println("Придумайте логин:")
    val userLogin = readln()

    println("Придумайте пароль:")
    val userPassword = readln()

    println("Вы успешно зарегистрированы!")
    println("")

    do {
        println("Для авторизации в приложении введите свои логин и пароль.")

        println("Введите ваш логин:")
        val registeredUserLogin = readln()

        println("Введите ваш пароль:")
        val registeredUserPassword = readln()
    } while ((userLogin!=registeredUserLogin)||(userPassword!=registeredUserPassword))

    println("Авторизация прошла успешно!")
}