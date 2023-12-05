package lesson_6

fun main() {
    val number = (1..9).random()
    var counter = 5

    println("Попробуйте угадать число от 1 до 9! У вас ${counter--} попыток:")
    var userNumber = readln().toInt()

    while (number != userNumber) {
        if (counter > 0) {
            println("Неверно! Кол-во оставшихся попыток: ${counter--}")
            userNumber = readln().toInt()
        } else {
            println("Вы так и не угадали. Было загадано число $number")
            return
        }
    }

    println("Вы угадали. Это была великолепная игра!")
}