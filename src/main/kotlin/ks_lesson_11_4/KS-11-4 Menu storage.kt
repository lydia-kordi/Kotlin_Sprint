package org.kotlin.sprint.ks_lesson_11_4

class Ingredient(
    val title: String,
    val quantity: Double,
    val measureUnits: String,
)

class Recipe(
    val cover: String,
    val title: String,
    val numberOfServings: Int,
    val cookingLevel: String,
    val ingredients: List<Ingredient>,
    val cookingMethod: List<String>,
    val inFavourites: Boolean,
)

class Category(
    val cover: String,
    val title: String,
    val descriptor: String,
    val recipes: List<Recipe>,
)
