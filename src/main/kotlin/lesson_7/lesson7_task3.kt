package lesson_7

fun main() {
    println("Введите предел вывода:")
    val maxNumber = readln().toInt()
    val rangeNum = 0..maxNumber

    for (i in rangeNum) {
        if (i % 2 == 0) println(i)
    }
}