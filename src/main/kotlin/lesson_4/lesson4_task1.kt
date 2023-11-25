package lesson_4

const val NUMBER_OF_TABLES = 13

fun main() {
    val bookedToday = 13
    val bookedTomorrow = 9

    val freeToday = bookedToday < NUMBER_OF_TABLES
    val freeTomorrow = bookedTomorrow < NUMBER_OF_TABLES

    println("Доступность столиков на сегодня: $freeToday,\nДоступность столиков на завтра: $freeTomorrow.")
}