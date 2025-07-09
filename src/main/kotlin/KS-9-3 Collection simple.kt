package org.example

fun main() {

   val omelet = mutableListOf(2, 50, 15)

    println("Сколько порций омлета вы хотите приготовить?")
    val portionsNumber = readln().toInt()

    val manyOmelets = omelet.map{
        it * portionsNumber
    }
    println("На $portionsNumber порций вам понадобится: \nяиц - ${manyOmelets[0]} шт, \nмолока - ${manyOmelets[1]} мл, \nсливочного масла - ${manyOmelets[2]} гр.")
}