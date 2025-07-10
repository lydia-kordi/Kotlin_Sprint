package org.example.KS_Lesson9

fun main() {

    val ingredients: MutableSet<String> = mutableSetOf()
    val ingredientsNumber = 5

    for (i in 1..ingredientsNumber) {
            println("Введите ингредиент #$i:")
            val userInput = readln().trim()
        ingredients += userInput
        }

    val sortedIngredients = ingredients
        .sorted()
        .toMutableList()

    sortedIngredients[0] = sortedIngredients[0].replaceFirstChar { it.uppercaseChar() }

    val formattedIngredients = sortedIngredients.joinToString(separator = ", ")

    println(formattedIngredients)
}

