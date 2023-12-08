package lesson_10

fun main() {
    var counterUserVictory = 0

    println("Начинаем игру!\n")

    while (true) {
        val playerThrow = throwDice()
        val computerThrow = throwDice()
        counterUserVictory += outputResult(playerThrow, computerThrow)

        println("\nХотите бросить кости еще раз? Введите Да или Нет")
        if (readln() != "Да") break
    }

    println("Вы выиграли $counterUserVictory раз!")
}

fun throwDice(): Int = (1..6).random()

fun outputResult(playerThrow: Int, computerThrow: Int): Int {
    println("Игрок бросил кубики и получил: $playerThrow")
    println("Компьютер бросил кубики и получил: $computerThrow")

    return if (playerThrow == computerThrow) {
        println("Ничья!")
        0
    } else if (playerThrow > computerThrow) {
        println("Победил игрок!")
        1
    } else {
        println("Победил компьютер!")
        0
    }
}