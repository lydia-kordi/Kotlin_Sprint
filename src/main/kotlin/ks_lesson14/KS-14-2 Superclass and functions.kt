package org.kotlin.sprint.ks_lesson14

open class NewLinerShip(
    val name: String,
    val speed: Int = 70,
    val cargoLoad: Int = 50,
    val passengerLoad: Int = 350,
) {
    open fun performShipment() {
        println("Выдвигается горизонтальный трап со шкафута...")
    }

    open fun printInfo() {
        println("Корабль $name развивает скорость: $speed, перевозит пассажиров: $cargoLoad, перевозит грузов: $passengerLoad")
    }
}

class NewIcebreakerShip(
    name: String,
    speed: Int = 20,
    cargoLoad: Int = 100,
    passengerLoad: Int = 10,
    val canBreakIce: Boolean = true,
) : NewLinerShip(name, speed, cargoLoad, passengerLoad) {

    override fun performShipment() {
        println("Открываются ворота со стороны кормы...")
    }

    override fun printInfo() {
        super.printInfo()
        println("А еще умеет колоть лёд!")
    }
}

class NewCargoShip(
    name: String,
    speed: Int = 40,
    cargoLoad: Int = 200,
    passengerLoad: Int = 25,
) : NewLinerShip(name, speed, cargoLoad, passengerLoad) {

    override fun performShipment() {
        println("Активируется погрузочный кран...")
    }
}

fun main() {
    val nevaShip = NewLinerShip(name = "Neva")
    val volgaShip = NewCargoShip(name = "Volga")
    val eniseyShip = NewIcebreakerShip(name = "Enisey")

    nevaShip.printInfo()
    volgaShip.printInfo()
    eniseyShip.printInfo()
}