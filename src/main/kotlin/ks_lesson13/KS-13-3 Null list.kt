package org.kotlin.sprint.ks_lesson13

class Contacts(val name: String, val phone: Long, val company: String? = null)

fun main() {

    val colleagueList = listOf(
        Contacts(name = "Боря", phone = 79329384537, company = "Rambler"),
        Contacts(name = "Вася", phone = 79329384538, company = "Yandex"),
        Contacts(name = "Катя", phone = 79329384539, company = "null"),
        Contacts(name = "Маша", phone = 79329384540, company = null),
        Contacts(name = "Света", phone = 79329384541),
    )

    val contactCompanies = mutableSetOf<String>()

    for (contact in colleagueList) {
        if (!contact.company.isNullOrEmpty()) {
            contactCompanies.add(contact.company)
        }
    }

    println(contactCompanies)

}