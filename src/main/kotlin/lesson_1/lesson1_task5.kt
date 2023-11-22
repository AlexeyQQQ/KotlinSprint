package lesson_1

const val SECOND_IN_MINUTE = 60
const val SECOND_IN_HOUR = 3600
const val SECOND_IN_GAGARIN_FLIGHT = 6480

fun main() {
    var seconds = SECOND_IN_GAGARIN_FLIGHT

    val hours = seconds / SECOND_IN_HOUR
    seconds -= hours * SECOND_IN_HOUR

    val minutes = seconds / SECOND_IN_MINUTE
    seconds -= minutes * SECOND_IN_MINUTE

    val result = String.format("0%s:%s:0%s", hours, minutes, seconds)
    println(result)
}