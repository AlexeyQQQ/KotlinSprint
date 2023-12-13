package lesson_15

fun main() {
    val temp = Temperature("10 Марта", 10)
    val prec = PrecipitationAmount("10 Марта", 5)
    val weatherServer = WeatherServer()

    weatherServer.sendMessage(temp)
    weatherServer.sendMessage(prec)
}

abstract class WeatherStationStats(
    val data: String
)


class Temperature(
    data: String,
    val temp: Int,
) : WeatherStationStats(data)


class PrecipitationAmount(
    data: String,
    val precipitation: Int,
) : WeatherStationStats(data)


class WeatherServer {
    fun sendMessage(weatherStationStats: WeatherStationStats) {
        if (weatherStationStats is Temperature) {
            println("Отправляю температуру ${weatherStationStats.data}: ${weatherStationStats.temp} градусов.")
        }
        if (weatherStationStats is PrecipitationAmount) {
            println("Отправляю кол-во осадков ${weatherStationStats.data}: ${weatherStationStats.precipitation} мм.")
        }
    }
}