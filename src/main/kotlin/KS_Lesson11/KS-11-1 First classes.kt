package org.kotlin.sprint.KS_Lesson11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
){
    fun printInfo() {
        println("Пользователь: id=$id, логин=$login, пароль=$password, email=$email")
    }
}

fun main() {
    val myUser = User(0, "yndx.lora", "12345","mail@mail.ru")
    val myOtherUser = User(1, "yndx.lera", "12345#","mail@gmail.ru")

    myUser.printInfo()
    myOtherUser.printInfo()
}