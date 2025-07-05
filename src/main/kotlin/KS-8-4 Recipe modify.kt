package org.example

fun main() {
    val recipe = arrayOf("Курица", "Ананас", "Зелёный лук", "Майонез")

    println("Текущий список ингридиентов: ${recipe.contentToString()}")
    println("Какой ингредиент вы хотите заменить?")

    val deprecatedIngredient = readln().replaceFirstChar { it.uppercaseChar() }

    if (recipe.contains(deprecatedIngredient)) {

        println("Какой ингридиент вы хотите добавить?")
        val newIngredient = readln()

        recipe[recipe.indexOf(deprecatedIngredient)] = newIngredient.replaceFirstChar { it.uppercaseChar() }

        println("Готово! Вы сохранили следующий список: ${recipe.contentToString()}")

    } else {
        println("Ингредиента $deprecatedIngredient в рецепте нет")
    }
}