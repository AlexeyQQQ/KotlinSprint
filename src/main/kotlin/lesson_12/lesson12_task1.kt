package lesson_12

fun main() {
    val day1 = Weather()
    val day2 = Weather()

    println(day1)
    println(day2)

    day1.isRainfall = false
    day2.nightTemperature = "-20"

    println(day1)
    println(day2)
}


class Weather {
    var nightTemperature = "-10"
    var dayTemperature = "+10"
    var isRainfall = true

    override fun toString(): String {
        return "Weather(nightTemperature='$nightTemperature', dayTemperature='$dayTemperature', isRainfall=$isRainfall)"
    }
}
