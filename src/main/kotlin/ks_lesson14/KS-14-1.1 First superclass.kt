package org.kotlin.sprint.ks_lesson14

open class LinerShip(
    val name: String,
    open val speed: Int = 70,
    open val cargoLoad: Int = 50,
    open val passengerLoad: Int = 350,
)

class CargoShip(name: String) : LinerShip(name) {
    override val speed: Int = 40
    override val cargoLoad: Int = 200
    override val passengerLoad: Int = 25
}

class IcebreakerShip(name: String) : LinerShip(name) {
    override val speed: Int = 20
    override val cargoLoad: Int = 100
    override val passengerLoad: Int = 10
    val canBreakIce: Boolean = true
}

fun main() {
    val linerShip = LinerShip(name = "Neva")
    val cargoShip = CargoShip(name = "Volga")
    val icebreakerShip = IcebreakerShip(name = "Enisey")
}