package org.kotlin.sprint.ks_lesson11_2

fun main() {
    val myUser = User2(2, "yndx.lora", "12345", "mail@mail.ru")

    myUser.setBio()
    myUser.changePassword()
    myUser.printInfo()
}

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String? = null,
) {
    fun printInfo() {
        println(
            "User2: id=$id, login=$login, password=$password, email=$email" +
                    (if (bio != null) ", bio=$bio" else "")
        )
    }

    fun setBio() {
        println("Добавьте немного информации о себе:")
        bio = readln()
    }

    fun changePassword() {
        println("Чтобы изменить пароль, сначала введите старый:")
        val currentPassword = readln().trim()
        if (currentPassword == password) {
            println("Введите новый пароль")
            password = readln().trim()
            println("Пароль успешно изменен!")
        } else println("Вы мошенник, мы вас блокируем")
    }
}