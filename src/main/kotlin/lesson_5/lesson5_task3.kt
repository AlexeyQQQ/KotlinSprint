package lesson_5

fun main() {
    val winNum1 = 18
    val winNum2 = 30

    println("Угадайте 2 числа (от 0 до 42), чтобы выиграть приз!\nВведите первое число:")
    val userNum1 = readln().toInt()
    println("Введите второе число:")
    val userNum2 = readln().toInt()

    when {
        userNum1 == winNum1 ->
            if (userNum2 == winNum2) println("Поздравляем! Вы выиграли главный приз!")
            else println("Вы выиграли утешительный приз!")

        userNum1 == winNum2 ->
            if (userNum2 == winNum1) println("Поздравляем! Вы выиграли главный приз!")
            else println("Вы выиграли утешительный приз!")

        userNum2 == winNum1 -> println("Вы выиграли утешительный приз!")
        userNum2 == winNum2 -> println("Вы выиграли утешительный приз!")
        else -> println("Неудача!")
    }

    println("Числа для победы: $winNum1 и $winNum2")
}