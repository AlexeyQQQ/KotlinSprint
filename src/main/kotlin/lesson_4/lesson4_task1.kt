package lesson_4

fun main() {
    val numberOfTables = 13
    val bookedToday = numberOfTables
    val bookedTomorrow = numberOfTables - 4

    val freeToday = bookedToday < numberOfTables
    val freeTomorrow = bookedTomorrow < numberOfTables

    println("Доступность столиков на сегодня: $freeToday,\nДоступность столиков на завтра: $freeTomorrow.")
}