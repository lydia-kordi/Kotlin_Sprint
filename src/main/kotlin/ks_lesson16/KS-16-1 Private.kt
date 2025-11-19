package org.kotlin.sprint.ks_lesson16

class Dice {
    private val diceRoll: Int = (1..6).random()

    fun getNumber() {
        println("Выпал номер: $diceRoll")
    }
}

fun main() {
    val secretNumber = Dice()
    secretNumber.getNumber()
}