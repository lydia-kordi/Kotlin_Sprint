package org.kotlin.sprint.KS_Lesson12

import kotlin.math.round

class DailyWeather4(dayTemperature4: Int, nightTemperature4: Int, isRainfall4: Boolean) {
    var dayTemperature4 = dayTemperature4
    var nightTemperature4 = nightTemperature4
    var isRainfall4 = isRainfall4

    init {
        this.dayTemperature4 = round(dayTemperature4 - 273.15).toInt()
        this.nightTemperature4 = round(nightTemperature4 - 273.15).toInt()

        println("Дневная температура: ${this.dayTemperature4}°C")
        println("Ночная температура: ${this.nightTemperature4}°C")
        println("Осадки: ${if (this.isRainfall4) "да" else "нет"}")
    }
}

fun main() {
    val mondayWeather = DailyWeather4(dayTemperature4 = 290, nightTemperature4 = 270, isRainfall4 = true)
    val tuesdayWeather = DailyWeather4(dayTemperature4 = 301, nightTemperature4 = 285, isRainfall4 = false)

}