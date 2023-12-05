package lesson_8

fun main() {
    val day1 = 1000
    val day2 = 2000
    val day3 = 3000
    val day4 = 4000
    val day5 = 5000
    val day6 = 6000
    val day7 = 7000
    val arrayOfViews = intArrayOf(day1, day2, day3, day4, day5, day6, day7)

    println("Кол-во просмотров за неделю: ${arrayOfViews.sum()}")
}