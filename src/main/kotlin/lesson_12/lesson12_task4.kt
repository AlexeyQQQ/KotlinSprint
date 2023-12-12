package lesson_12

fun main() {
    val day1 = Weather4(273, 303, false)
    val day2 = Weather4(0, 273, true)
}

class Weather4(
    nightTemperature: Int,
    dayTemperature: Int,
    isRainfall: Boolean,
) {
    var nightTemperatureKelvin = nightTemperature
    var dayTemperatureKelvin = dayTemperature
    var isRainfall = isRainfall

    init {
        println(
            """
            Температура ночью в Цельсиях: ${String.format("%.2f", nightTemperatureKelvin - 273.15)}
            Температура днем в Цельсиях: ${String.format("%.2f", dayTemperatureKelvin - 273.15)}
            Были ли осадки: $isRainfall
        """.trimIndent()
        )
    }
}