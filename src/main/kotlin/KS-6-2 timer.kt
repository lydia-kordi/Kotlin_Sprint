package org.example

fun main() {
    println("Сколько секунд нужно засечь?")
    val secondsCount = readln().toInt()
    val delayTime: Long = 1000 * secondsCount.toLong()

    Thread.sleep(delayTime)

    println("Прошло $secondsCount секунд!")
}