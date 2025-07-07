package org.example
fun main() {
    val lettersRange = 'a'..'z'
    val numbersRange = 0..9
    var password = ""
    val passwordSize = 6

    for (i in 0 until passwordSize) {
        if (i % 2 == 0) {
            password += lettersRange.random()
        } else {
            password += numbersRange.random()
        }
    }

    println("Сгенерированный пароль: $password")
}