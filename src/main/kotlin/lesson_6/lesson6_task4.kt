package lesson_6

fun main() {
    val number = (1..9).random()
    var counter = 5

    println("Попробуйте угадать число от 1 до 9! У вас ${counter--} попыток:")
    var userNumber = readln().toInt()

    while (userNumber != number && counter > 0) {
        println("Неверно! Кол-во оставшихся попыток: ${counter--}")
        userNumber = readln().toInt()
    }

    if (number == userNumber) {
        println("Вы угадали. Это была великолепная игра!")
    } else {
        println("Вы так и не угадали. Было загадано число $number")
    }
}