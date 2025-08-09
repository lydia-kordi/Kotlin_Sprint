package org.example.KS_Lesson10

fun main() {
    val userRoll = diceRoll()
    println("Игрок выбросил число: $userRoll")

    val computerRoll = diceRoll()
    println("Компьютер выбросил число: $computerRoll")

    resultCheck(userRoll, computerRoll)
}
fun diceRoll (): Int = (1..6).random()

fun resultCheck(userRoll: Int, computerRoll: Int) {
    when {
        userRoll > computerRoll -> println("Победило человечество!")
        userRoll < computerRoll -> println("Победила машина!")
        else -> println("Победила дружба!")
    }
}