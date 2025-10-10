package org.kotlin.sprint.KS_Lesson12

class DailyWeather2(val dayTemperature2: Int, val nightTemperature2: Int, val isRainfall2: Boolean) {

    fun showWeather() {
        println("Дневная температура: $dayTemperature2°C")
        println("Ночная температура: $nightTemperature2°C")
        println("Осадки: ${if (isRainfall2) "да" else "нет"}")
    }
}

fun main() {
    val mondayWeather2 = DailyWeather2(dayTemperature2 = 29, nightTemperature2 = 27, isRainfall2 = true)
    val tuesdayWeather2 = DailyWeather2(dayTemperature2 = 30, nightTemperature2 = 28, isRainfall2 = false)

    mondayWeather2.showWeather()
    tuesdayWeather2.showWeather()
}
