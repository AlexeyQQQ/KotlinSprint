package lesson_21

fun main() {
    println(listOf(100, 20, 30, 11, 21, 31).evenNumbersSum())
}

fun List<Int>.evenNumbersSum(): Int = this.filter { it % 2 == 0 }.sum()