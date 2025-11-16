package org.kotlin.sprint.ks_lesson15

abstract class ForumMember(
    val name: String,
    val isAdmin: Boolean,
) {
    abstract fun readForum()
    abstract fun writeMessage()
}

interface Managing {
    fun deleteMessage(adminName: String, userName: String) {
        println("Администратор $adminName удалил сообщение пользователя $userName")
    }

    fun deleteUser(adminName: String, userName: String) {
        println("Администратор $adminName удалил пользователя $userName из форума")
    }
}

class Administrator(name: String, isAdmin: Boolean = true) : Managing, ForumMember(name, isAdmin) {
    override fun readForum() {
        println("Прочитано администратором: $name")
    }

    override fun writeMessage() {
        println("Администратор $name печатает... ")
    }
}

class User(name: String, isAdmin: Boolean = false) : ForumMember(name, isAdmin) {
    override fun readForum() {
        println("Прочитано пользователем: $name")
    }

    override fun writeMessage() {
        println("Пользователь $name печатает... ")
    }
}

fun main() {
    val admin1 = Administrator(name = "Вася")
    val user1 = User(name = "Олег")

    user1.readForum()
    user1.writeMessage()
    admin1.readForum()
    admin1.deleteMessage(admin1.name, user1.name)
    admin1.deleteUser(admin1.name, user1.name)
    admin1.writeMessage()
}


