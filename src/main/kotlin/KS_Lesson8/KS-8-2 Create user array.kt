package org.example.KS_Lesson8

fun main() {
    println("Сколько Ингридиентов вы хотите записать в рецепт?")
    val indexCount = readln().toInt()

    val userArray = Array(indexCount) { "" }

    for (item in userArray.indices) {
        println("Введите Ингридиент ${item + 1}:")
        val userInput = readln().trim().replaceFirstChar { it.uppercaseChar() }

        userArray[item] = userInput
    }

    println("Поздравляем! Ваш рецепт: ${userArray.joinToString(", ")}")

}