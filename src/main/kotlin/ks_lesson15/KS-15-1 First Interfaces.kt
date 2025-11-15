package org.kotlin.sprint.ks_lesson15

interface Flyable {
    fun fly()
}

interface Swimmable {
    fun swim()
}

class Crucian : Swimmable {
    override fun swim() {
        println("Карась плавает только в пресной воде")
    }
}

class Seagull : Flyable, Swimmable {
    override fun fly() {
        println("Чайка умеет летать")
    }

    override fun swim() {
        println("Чайка может плавать в любой воде")
    }
}

class Duck : Flyable, Swimmable {
    override fun fly() {
        println("Утка умеет летать")
    }

    override fun swim() {
        println("Утка предпочитает плавать в пресной воде")
    }
}

fun main() {
    val crucian = Crucian()
    val seagull = Seagull()
    val duck = Duck()

    crucian.swim()
    seagull.fly()
    seagull.swim()
    duck.fly()
    duck.swim()
}