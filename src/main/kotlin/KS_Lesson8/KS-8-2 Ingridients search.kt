package org.example.KS_Lesson8

fun main() {
    val recipe = arrayOf("Курица", "Ананас", "Зелёный лук", "Майонез")

    println("Какой ингредиент вы хотите найти?")
    val ingredient = readln()

    var found = false

    for (item in recipe) {
        if (ingredient.lowercase() == item.lowercase()) {
            println("Ингредиент $ingredient в рецепте есть")
            found = true
            break
        }
    }

    if (!found) {
        println("Такого ингредиента в рецепте нет")
    }
}