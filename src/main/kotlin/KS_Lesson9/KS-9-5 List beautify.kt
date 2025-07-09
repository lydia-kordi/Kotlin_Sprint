package org.example.KS_Lesson9

fun main() {

    val ingredients: MutableList<String> = mutableListOf()
    val ingredientsNumber = 5

    for (i in 1..ingredientsNumber) {
        while (true) {
            println("Введите ингредиент #$i:")
            val userInput = readln().trim()
            if (ingredients.contains(userInput)) {
                println("Этот ингредиент уже был добавлен. Придумайте другой:")
            } else {
                ingredients += userInput
                break
            }
        }
    }
    val sortedIngredients = ingredients
        .sorted()
        .toMutableList()

    sortedIngredients[0] = sortedIngredients[0].replaceFirstChar { it.uppercaseChar() }

    val formattedIngredients = sortedIngredients.joinToString(separator = ", ")

    println(formattedIngredients)
}

