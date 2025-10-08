package org.kotlin.sprint.KS_Lesson12

class DailyWeather() {
    var dayTemperature = 0
    var nightTemperature = 0
    var isRainfall = false

    fun showWeather() {
        println("Дневная температура: $dayTemperature°C")
        println("Ночная температура: $nightTemperature°C")
        println("Осадки: ${if (isRainfall) "да" else "нет"}")
    }
}

fun main() {
    val mondayWeather = DailyWeather()
    mondayWeather.dayTemperature = 21
    mondayWeather.nightTemperature = 10
    mondayWeather.isRainfall = true

    val tuesdayWeather = DailyWeather()
    tuesdayWeather.dayTemperature = 25
    tuesdayWeather.nightTemperature = 12
    tuesdayWeather.isRainfall = false

    mondayWeather.showWeather()
    tuesdayWeather.showWeather()
}

