package org.example

fun main() {
    println("Сколько секунд нужно засечь?")
    val secondsCount = readln().toInt()
    var counter = secondsCount

    while (counter > 0) {
        Thread.sleep(1000)
        counter--
    }

    println("Прошло $secondsCount секунд!")
}