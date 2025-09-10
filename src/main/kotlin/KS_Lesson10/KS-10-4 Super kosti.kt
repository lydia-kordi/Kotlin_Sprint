package org.kotlin.sprint.KS_Lesson10

fun main() {
    var userWins = 0
    var playMore: Boolean

    do {
        val userWon = playRound()
        if (userWon) userWins++

        while (true) {
            print("Хотите бросить кости еще раз? Введите Да или Нет: ")
            when (readln().trim().lowercase()) {
                "да" -> { playMore = true; break }
                "нет" -> { playMore = false; break }
                else -> println("Введите 'Да' или 'Нет'")
            }
        }
    } while (playMore)

    println("Игра окончена. Вы выиграли партий: $userWins")
}

fun rollDice(quantity: Int = 6): Int = (1..quantity).random()

fun playRound(): Boolean {
    val userRoll = rollDice()
    val computerRoll = rollDice()

    println("Вы бросили: $userRoll")
    println("Компьютер бросил: $computerRoll")

    return when {
        userRoll > computerRoll -> {
            println("Победило человечество!")
            true
        }
        userRoll < computerRoll -> {
            println("Победила машина!")
            false
        }
        else -> {
            println("Победила дружба!")
            false
        }
    }
}
