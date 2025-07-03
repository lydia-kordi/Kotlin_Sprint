package org.example

fun main() {
    val numbersRange = 0..9
    val lettersRange = 'a'..'z'

    for (i in 1..3) {
        val randomNumber = numbersRange.random()
        val randomLetter = lettersRange.random()
        print("$randomNumber$randomLetter")
    }
}