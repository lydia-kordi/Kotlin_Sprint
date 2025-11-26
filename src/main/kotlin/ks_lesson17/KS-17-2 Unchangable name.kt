package org.kotlin.sprint.ks_lesson17

class Ship(name: String, var estimatedSpeed: Int, val baseDock: String) {
    var name: String = name
        set(value) {
            println("Название корабля нельзя изменять")
        }
}

fun main() {

    val ship = Ship(name = "Победа", estimatedSpeed = 30, baseDock = "Ленинград морской")

    ship.name = "Беда"
    println(ship.name)
}