package org.kotlin.sprint.ks_lesson14

abstract class Figure {
    abstract val color: String?
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double
}

class Circle(
    override val color: String?,
    val radius: Int,
) : Figure() {
    override fun calculateArea(): Double {
        val circleArea = radius * radius * Math.PI
        return circleArea
    }

    override fun calculatePerimeter(): Double {
        val circlePerimeter = 2 * radius * Math.PI
        return circlePerimeter
    }
}

class Rectangle(
    override val color: String?,
    val length: Int,
    val width: Int,
) : Figure() {
    override fun calculateArea(): Double {
        val rectangleArea = length * width.toDouble()
        return rectangleArea
    }

    override fun calculatePerimeter(): Double {
        val rectanglePerimeter = 2 * (length + width).toDouble()
        return rectanglePerimeter
    }
}

fun main() {
    val circle1 = Circle(color = "Black", radius = 2)
    val circle2 = Circle(color = "White", radius = 3)

    val rectangle1 = Rectangle(color = "Black", length = 10, width = 15)
    val rectangle2 = Rectangle(color = "White", length = 12, width = 19)
    val rectangle3 = Rectangle(color = "Black", length = 5, width = 21)

    val figuresList: List<Figure?> = listOf(circle1, circle2, rectangle1, rectangle2, rectangle3)

    var blackPerimeter = 0.0
    var whiteArea = 0.0

    for (figure in figuresList) {
        when (figure?.color) {
            "White" -> whiteArea += figure.calculateArea()
            "Black" -> blackPerimeter += figure.calculatePerimeter()
            else -> {}
        }
    }

    println("Сумма периметров всех чёрных фигур: $blackPerimeter")
    println("Сумма площадей всех белых фигур: $whiteArea")
}