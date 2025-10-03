package org.kotlin.sprint.KS_Lesson11_3

fun main() {

    val userOne = ChatUser(nickname = "Вася", avatar = "vasya99.jpg", actualStatus = UserStatus.MUTED.badge)
    val userTwo = ChatUser(nickname = "Оля", avatar = "1111.jpg")
    val userThree = ChatUser(nickname = "Олег", avatar = "olegoleg.jpg", actualStatus = UserStatus.TALKING.badge)
    val userFour = ChatUser(nickname = "Константин", avatar = "kkkkk.jpg")
    val userFive = ChatUser(nickname = "Яна", avatar = "yana2002.jpg", actualStatus = UserStatus.TALKING.badge)
    val extraUser = ChatUser(nickname = "Маша", avatar = "mashaa.jpg")

    val kotlinChatRoom = ChatRoom(
        cover = "android.jpg",
        title = "Обсуждаем Котлин",
        chatUsers = mutableListOf(userOne, userTwo, userThree, userFour, userFive)
    )
}

class ChatUser(var nickname: String, var avatar: String, var actualStatus: String = UserStatus.MIC_OFF.badge) {
    fun clickLong() {
        println(nickname)
    }

    fun printStatus() {
        println("У пользователя $nickname статус: $actualStatus")
    }
}

enum class UserStatus(val badge: String) {
    MIC_OFF("микрофон выключен"),
    TALKING("разговаривает"),
    MUTED("пользователь заглушен")
}

class ChatRoom(var cover: String, var title: String, var chatUsers: MutableList<ChatUser>) {
    fun addUser(user: ChatUser) {
        chatUsers.add(user)
        println("К чату присоединился пользователь ${user.nickname}")
    }

    fun changeStatus(user: ChatUser, newStatus: String) {
        user.actualStatus = newStatus
        println("У пользователя ${user.nickname} новый статус: ${user.actualStatus}")
    }
}