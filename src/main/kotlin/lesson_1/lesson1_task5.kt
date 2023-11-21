package lesson_1

fun main() {
    var seconds = 6480

    val hours = seconds / 3600
    seconds -= hours * 3600

    val minutes = seconds / 60
    seconds -= minutes * 60

    val hoursCorrect = if (hours < 10) "0$hours" else "$hours"
    val minutesCorrect = if (minutes < 10) "0$minutes" else "$minutes"
    val secondsCorrect = if (seconds < 10) "0$seconds" else "$seconds"
    println("$hoursCorrect:$minutesCorrect:$secondsCorrect")
}