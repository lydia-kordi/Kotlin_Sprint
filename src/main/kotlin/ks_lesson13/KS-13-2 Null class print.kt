package org.kotlin.sprint.ks_lesson13

class TelephoneBook(val name: String, val phone: Long, val company: String? = null) {

    fun printInfo() {
        println("${name}, ${phone}, ${company ?: "<Не указано>"}")
    }
}

fun main() {
    val person = TelephoneBook(name = "Боря", phone = 79329384537, company = "Rambler")
    person.printInfo()

}