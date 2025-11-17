package org.kotlin.sprint.ks_lesson15

abstract class Item {
    abstract val name: String
    abstract val quantity: Int
}

interface Searching {
    fun searchItem() {
        println("Выполняется поиск...")
    }

    fun getResult(name: String, quantity: Int) {
        println("Наименование: $name. Найдено товаров: $quantity")
    }
}

class Instrument(
    override val name: String,
    override val quantity: Int,
) : Searching, Item() {

    fun showResult() {
        getResult(name, quantity)
    }
}

class Accessory(
    override val name: String,
    override val quantity: Int,
    val instrument: Instrument,
) : Item()

fun main() {
    val violin = Instrument(name = "Скрипка", quantity = 3)
    val string = Accessory(name = "Комплект струн", quantity = 15, instrument = violin)

    violin.searchItem()
    violin.showResult()
}