package lesson_4

fun main() {
    val day = 5

    val arms = day % 2 != 0
    val legs = day % 2 == 0
    val back = day % 2 == 0
    val abs = day % 2 != 0

    println("""
        Упражнения для рук:    $arms
        Упражнения для ног:    $legs
        Упражнения для спины:  $back
        Упражнения для пресса: $abs
    """.trimIndent())
}