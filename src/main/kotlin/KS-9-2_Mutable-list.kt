package org.example

fun main() {
    val userRecipe = mutableListOf("Кола", "Лёд", "Лимон")

    println("В рецепте есть базовые ингредиенты: $userRecipe")

    println("Желаете добавить что-то еще?")
    val userAnswer = readln()

    val rightAnswer = "Да"

    if (userAnswer.equals(rightAnswer, ignoreCase = true)) {

        println("Како_й ингредиент вы хотите добавить?")
        val newIngredient = readln().replaceFirstChar { it.uppercaseChar() }

        userRecipe.add(newIngredient)

        println("Теперь в рецепте есть следующие ингредиенты: $userRecipe")

        }

}