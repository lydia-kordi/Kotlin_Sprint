package org.example

fun main() {
    println("Сколько секунд нужно засечь?")
    var secondsCount = readln().toInt()

    for (i in secondsCount downTo 0) {
        println("Осталось секунд: $secondsCount")
        Thread.sleep(1000)
        secondsCount--
    }

    println("")
    println("Время вышло.")
}