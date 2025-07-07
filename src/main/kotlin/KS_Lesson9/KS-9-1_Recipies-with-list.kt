package org.example.KS_Lesson9

fun main() {
    val ingredientsList = listOf("Картошка", "Редис", "Колбаса", "Огурец", "Зеленый лук", "Айран")

    println("В рецепте есть следующие ингридиенты:")

    ingredientsList.forEach {
        println(it)
    }
}