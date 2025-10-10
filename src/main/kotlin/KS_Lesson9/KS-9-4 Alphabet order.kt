package org.example

fun main() {

    println("Перечислите пять ингредиентов вашего блюда через запятую с пробелом:")
    val fiveIngredients = readln()
        .split(", ")
        .sorted()

    println(fiveIngredients)

}