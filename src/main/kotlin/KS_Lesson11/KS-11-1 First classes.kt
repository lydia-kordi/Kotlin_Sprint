package org.kotlin.sprint.KS_Lesson11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
) {
    fun printInfo() {
        println("Пользователь: id=$id, логин=$login, пароль=$password, email=$email")
    }
}

fun main() {
    val myUser = User(id = 0, login = "yndx.lora", password = "12345", email = "mail@mail.ru")
    val myOtherUser = User(id = 1, login = "yndx.lera", password = "12345#", email = "mail@gmail.ru")

    myUser.printInfo()
    myOtherUser.printInfo()
}