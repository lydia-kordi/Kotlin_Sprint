package org.kotlin.sprint.KS_Lesson12

import kotlin.math.round

const val KELVIN_TO_CELSIUS_OFFSET1 = 273.15

class DailyWeather4(dayTemperatureK: Int, nightTemperatureK: Int, isRainfall: Boolean) {
    val dayTemperature = round(dayTemperatureK - KELVIN_TO_CELSIUS_OFFSET1).toInt()
    val nightTemperature = round(nightTemperatureK - KELVIN_TO_CELSIUS_OFFSET1).toInt()
    val isRainfall = isRainfall

    init {
        println("Дневная температура: ${dayTemperature}°C")
        println("Ночная температура: ${nightTemperature}°C")
        println("Осадки: ${if (isRainfall) "да" else "нет"}")
    }

}

fun main() {
    val mondayWeather = DailyWeather4(dayTemperatureK = 290, nightTemperatureK = 270, isRainfall = true)
    val tuesdayWeather = DailyWeather4(dayTemperatureK = 301, nightTemperatureK = 285, isRainfall = false)

}