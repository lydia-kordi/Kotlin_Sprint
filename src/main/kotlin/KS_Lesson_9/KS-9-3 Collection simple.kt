package org.example

fun main() {

   val omelet = listOf(2, 50, 15)

    println("Сколько порций омлета вы хотите приготовить?")
    val portionsNumber = readln().toInt()

    val manyOmelets = omelet.map{
        it * portionsNumber
    }
    println("На $portionsNumber порций вам понадобится:" +
            "яиц - ${manyOmelets[0]} шт," +
            "молока - ${manyOmelets[1]} мл, " +
            "сливочного масла - ${manyOmelets[2]} гр.")
}