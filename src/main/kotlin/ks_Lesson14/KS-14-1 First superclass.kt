package org.kotlin.sprint.ks_Lesson14

open class LinerShip(
    val name: String,
    val speed: Int = 70,
    val cargoLoad: Int = 50,
    val passengerLoad: Int = 350,
)

class CargoShip(
    name: String,
    speed: Int = 40,
    cargoLoad: Int = 200,
    passengerLoad: Int = 25,
) : LinerShip(name, speed, cargoLoad, passengerLoad)

class IcebreakerShip(
    name: String,
    speed: Int = 20,
    cargoLoad: Int = 100,
    passengerLoad: Int = 10,
    val canBreakIce: Boolean = true,
) : LinerShip(name, speed, cargoLoad, passengerLoad)

fun main() {
    val nevaShip = LinerShip(name = "Neva")
    val volgaShip = CargoShip(name = "Volga")
    val eniseyShip = IcebreakerShip(name = "Enisey")
}