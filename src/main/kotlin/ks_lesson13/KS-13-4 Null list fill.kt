package org.kotlin.sprint.ks_lesson13

class MyContacts(val name: String, val phone: Long, val company: String? = null) {
    fun printInfo() {
        println("${name}, ${phone}, ${company ?: "<Не указано>"}")
    }
}

class MyPhoneBook(val contacts: MutableList<MyContacts>) {
    fun printContacts() {
        println("Телефонная книга:")
        for (contact in contacts) {
            contact.printInfo()
        }
    }
}

fun main() {
    val phoneBook = mutableListOf<MyContacts>()
    var response: String

    while (true) {
        println("Введите имя:")
        val name = readln().trim()

        println("Введите номер телефона:")
        val phoneInput = readln().trim()
        val phone = phoneInput.toLongOrNull()

        if (phone == null) {
            println("Номер неправильный. Начнем заново")
            continue
        }

        println("Введите компанию (или оставьте пустым):")
        val companyInput = readln().trim()
        val company = companyInput.ifEmpty { null }

        val contact = MyContacts(name = name, phone = phone, company = company)
        phoneBook.add(contact)

        println("Вы добавили контакт!")

        println("Хотите ввести ещё один контакт? (да/нет):")
        response = readln().trim().lowercase()

        if (response != "да") {
            break
        }
    }
    val myPhoneBook = MyPhoneBook(phoneBook)
    myPhoneBook.printContacts()
}

