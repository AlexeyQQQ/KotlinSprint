package lesson_12

import kotlin.random.Random

fun main() {
    val listOfDays = mutableListOf<Weather5>()

    for (i in 0..29) {
        listOfDays.add(
            Weather5(
                (243..273).random(),
                (273..313).random(),
                Random.nextBoolean()
            )
        )
    }

    val listOfNightTemperatureKelvin = mutableListOf<Int>()
    val listOfDayTemperatureKelvin = mutableListOf<Int>()
    val listOfRainfall = mutableListOf<Boolean>()

    for (i in listOfDays) {
        listOfNightTemperatureKelvin.add(i.nightTemperatureKelvin)
        listOfDayTemperatureKelvin.add(i.dayTemperatureKelvin)
        listOfRainfall.add(i.isRainfall)
    }

    println()
    println(
        """
        Средняя температура ночью в Цельсиях: ${String.format("%.2f", listOfNightTemperatureKelvin.average() - 273.15)}
        Средняя температура днем в Цельсиях: ${String.format("%.2f", listOfDayTemperatureKelvin.average() - 273.15)}
        Кол-во дней с осадками: ${listOfRainfall.count { it == true }}
    """.trimIndent()
    )
}


class Weather5(
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