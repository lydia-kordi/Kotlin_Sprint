package org.kotlin.sprint.ks_lesson17

class Parcel(
    val parcelNumber: String,
    currentLocation: String,
) {
    private var movementCount: Int = 0
    var location: String = currentLocation
        set(value) {
            field = value
            movementCount++
        }

    fun getMovementCount(): Int {
        return movementCount
    }
}

fun main() {
    val myParcel = Parcel(parcelNumber = "111111111", currentLocation = "Сортировочный центр 1")
    println("Начальное местоположение: ${myParcel.location}")
    println("Общее количество перемещений посылки ${myParcel.parcelNumber}: ${myParcel.getMovementCount()}")

    myParcel.location = "Сортировочный центр 2"
    println("Новое местоположение: ${myParcel.location}")
    println("Общее количество перемещений посылки ${myParcel.parcelNumber}: ${myParcel.getMovementCount()}")

    myParcel.location = "Сортировочный центр 3"
    println("Новое местоположение: ${myParcel.location}")
    println("Общее количество перемещений посылки ${myParcel.parcelNumber}: ${myParcel.getMovementCount()}")
}