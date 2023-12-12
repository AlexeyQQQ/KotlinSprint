package lesson_12

fun main() {
    val day1 = Weather2("-10", "15", true)
    val day2 = Weather2("15", "30", false)

    println(day1)
    println(day2)
}


class Weather2(
    var nightTemperature: String,
    var dayTemperature: String,
    var isRainfall: Boolean,
) {
    override fun toString(): String {
        return "Weather(nightTemperature='$nightTemperature', dayTemperature='$dayTemperature', isRainfall=$isRainfall)"
    }
}