package lesson_2

const val MINUTES_IN_HOUR = 60

fun main() {
    val startHour: Int = 9
    val startMinute: Int = 39
    val travelTime: Int = 457

    val minutesFromMidnight = startHour * MINUTES_IN_HOUR + startMinute

    val endHour = (minutesFromMidnight + travelTime) / MINUTES_IN_HOUR
    val endMinute = (minutesFromMidnight + travelTime) - endHour * MINUTES_IN_HOUR

    println("$endHour:$endMinute")
}