package org.kotlin.sprint.ks_lesson15

abstract class WeatherStationStats(val location: String)

class Temperature(location: String, val temperature: Double) : WeatherStationStats(location)

class PrecipitationAmount(location: String, val precipitation: Double) : WeatherStationStats(location)

class WeatherServer {
    fun sendData(data: WeatherStationStats?) {

        data ?: return println("Получены некорректные данные")

        when (data) {
            is Temperature -> {
                println("Отправка данных температуры: ${data.temperature}°C. Локация: ${data.location}")
            }

            is PrecipitationAmount -> {
                println("Отправка данных осадков: ${data.precipitation} мм. Локация: ${data.location}")
            }

            else -> {
                println("Неизвестный тип данных")
            }
        }
    }
}

fun main() {
    val temperatureData = Temperature(location = "Фукуок", temperature = 30.5)
    val precipitationData = PrecipitationAmount(location = "Фукуок", precipitation = 5.0)

    val weatherServer = WeatherServer()
    val weatherServer1 = WeatherServer()

    weatherServer.sendData(temperatureData)
    weatherServer.sendData(precipitationData)
    weatherServer1.sendData(data = null)
}