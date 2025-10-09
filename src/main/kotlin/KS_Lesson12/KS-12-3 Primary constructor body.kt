package org.kotlin.sprint.KS_Lesson12

import kotlin.math.round

class DailyWeather3(dayTemperature3: Int, nightTemperature3: Int, isRainfall3: Boolean) {
    var dayTemperature3 = dayTemperature3
    var nightTemperature3 = nightTemperature3
    var isRainfall3 = isRainfall3

    init {
        this.dayTemperature3 = round(dayTemperature3 - 273.15).toInt()
        this.nightTemperature3 = round(nightTemperature3 - 273.15).toInt()
    }

    fun showWeather() {
        println("Дневная температура: $dayTemperature3°C")
        println("Ночная температура: $nightTemperature3°C")
        println("Осадки: ${if (isRainfall3) "да" else "нет"}")
    }
}

fun main() {
    val mondayWeather = DailyWeather3(dayTemperature3 = 290, nightTemperature3 = 270, isRainfall3 = true)
    val tuesdayWeather = DailyWeather3(dayTemperature3 = 301, nightTemperature3 = 285, isRainfall3 = false)

    mondayWeather.showWeather()
    tuesdayWeather.showWeather()
}