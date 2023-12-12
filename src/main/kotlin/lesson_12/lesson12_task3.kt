package lesson_12

fun main() {
    val day1 = Weather3(273, 303, false)
    val day2 = Weather3(0, 273, true)

    day1.printInfo()
    day2.printInfo()
}

class Weather3(
    nightTemperature: Int,
    dayTemperature: Int,
    isRainfall: Boolean,
) {
    var nightTemperatureKelvin = nightTemperature
    var dayTemperatureKelvin = dayTemperature
    var isRainfall = isRainfall

    fun printInfo() {
        println(
            """
            Температура ночью в Цельсиях: ${String.format("%.2f", nightTemperatureKelvin - 273.15)}
            Температура днем в Цельсиях: ${String.format("%.2f", dayTemperatureKelvin - 273.15)}
            Были ли осадки: $isRainfall
        """.trimIndent()
        )
    }
}