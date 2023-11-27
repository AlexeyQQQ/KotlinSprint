package lesson_5

fun main() {
    val winNumbers = mutableListOf<Int>()
    repeat(3) {
        var number = (Math.random() * 43).toInt()
        while (winNumbers.contains(number)) {
            number = (Math.random() * 43).toInt()
        }
        winNumbers.add(number)
    }

    println("Попробуйте угадать 3 числа (от 0 до 42) и выиграть приз!")

    val userNumbers = mutableListOf<Int>()
    for (i in 1..3) {
        println("Введите число $i:")
        userNumbers.add(readln().toInt())
    }

    val numberOfMatches = winNumbers.intersect(userNumbers).size
    when (numberOfMatches) {
        3 -> println("Вы угадали все 3 числа и выиграли джекпот!")
        2 -> println("Вы угадали 2 числа и выиграли крупный приз!")
        1 -> println("Вы угадали 1 число и выиграли утешительный приз!")
        else -> println("Вы ничего не угадали!")
    }

    println("Выигрышные числа: ${winNumbers.joinToString()}")
}