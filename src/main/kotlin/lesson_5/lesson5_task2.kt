package lesson_5

const val AGE_OF_MAJORITY = 18
const val CURRENT_YEAR = 2023

fun main() {
    println("Введите свой год рождения:")

    val birthYear = readln().toInt()

    if (CURRENT_YEAR - birthYear >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
    else println("Вернуться на главный экран")
}