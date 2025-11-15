package org.kotlin.sprint.ks_lesson14

const val Black = "Black"
const val White = "White"

abstract class Figure {
    abstract val color: String
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double
}

class Circle(
    override val color: String,
    val radius: Int,
) : Figure() {
    override fun calculateArea(): Double = radius * radius * Math.PI
    override fun calculatePerimeter() = 2 * radius * Math.PI
}

class Rectangle(
    override val color: String,
    val length: Int,
    val width: Int,
) : Figure() {
    override fun calculateArea(): Double = length * width.toDouble()
    override fun calculatePerimeter(): Double = 2 * (length + width).toDouble()
}

fun main() {
    val circle1 = Circle(color = Black, radius = 2)
    val circle2 = Circle(color = White, radius = 3)

    val rectangle1 = Rectangle(color = Black, length = 10, width = 15)
    val rectangle2 = Rectangle(color = White, length = 12, width = 19)
    val rectangle3 = Rectangle(color = Black, length = 5, width = 21)

    val figuresList: List<Figure> = listOf(circle1, circle2, rectangle1, rectangle2, rectangle3)

    val blackPerimeter = figuresList.filter { it.color == Black }.sumOf { it.calculatePerimeter() }
    val whiteArea= figuresList.filter { it.color == White }.sumOf { it.calculateArea() }

    println("Сумма периметров всех чёрных фигур: $blackPerimeter")
    println("Сумма площадей всех белых фигур: $whiteArea")
}