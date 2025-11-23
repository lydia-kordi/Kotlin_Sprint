package org.kotlin.sprint.ks_lesson16

class Order(val orderNumber: String) {
    private var status: String = "Создан"

    fun getStatus(): String {
        return status
    }

    private fun changeStatus(newStatus: String) {
        status = newStatus
    }

    fun requestStatusChange(newStatus: String) {
        println("Заявка на изменение статуса на '$newStatus' для заказа $orderNumber отправлена менеджеру")
        changeStatus(newStatus)
    }
}

fun main() {
    val order = Order(orderNumber = "12345")
    println("Текущий статус: ${order.getStatus()}")

    order.requestStatusChange(newStatus = "Принят")
    println("Статус после изменения: ${order.getStatus()}")
}
