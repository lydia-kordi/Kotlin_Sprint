package org.example.KS_Lesson8

fun main() {
    val recipe = arrayOf("Курица", "Ананас", "Зелёный лук", "Майонез")

    println("Какой ингредиент вы хотите найти?")
    val ingredient = readln()
    val capitalizedIngredient = ingredient.replaceFirstChar { it.uppercaseChar() }

    if (recipe.contains(capitalizedIngredient)) {
        println("Ингредиент $ingredient в рецепте есть")
    } else {
        println("Ингредиента $ingredient в рецепте нет")
    }
}
