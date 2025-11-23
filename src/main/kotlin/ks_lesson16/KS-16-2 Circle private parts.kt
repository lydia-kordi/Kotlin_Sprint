package org.kotlin.sprint.ks_lesson16

class Circle(private val radius: Int) {

    private companion object {
        const val PI = 3.14
    }

    fun getCircumference() {
        val circumference = 2 * radius * PI
        println("Длина окружности: $circumference")
    }

    fun getArea() {
        val area = PI * radius * radius
        println("Площадь окружности: $area")
    }
}

fun main() {
    val circle1 = Circle(radius = 4)
    circle1.getArea()
    circle1.getCircumference()
}