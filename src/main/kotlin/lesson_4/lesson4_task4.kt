package lesson_4

fun main() {
    val day = 5
    val isEvenDay = day % 2 == 0

    println("""
        Упражнения для рук:    ${!isEvenDay}
        Упражнения для ног:    $isEvenDay
        Упражнения для спины:  $isEvenDay
        Упражнения для пресса: ${!isEvenDay}
    """.trimIndent())
}