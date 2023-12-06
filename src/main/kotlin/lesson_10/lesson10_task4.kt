package lesson_10

private var counterUserVictory = 0

fun main() {
    println("Начинаем игру!\n")

    while (true) {
        val playerThrow = throwDice()
        val computerThrow = throwDice()
        outputResult(playerThrow, computerThrow)

        println("\nХотите бросить кости еще раз? Введите Да или Нет")
        if (readln() != "Да") break
    }

    println("Вы выиграли $counterUserVictory раз!")
}

fun throwDice(): Int = (1..6).random()

fun outputResult(playerThrow: Int, computerThrow: Int) {
    println("Игрок бросил кубики и получил: $playerThrow")
    println("Компьютер бросил кубики и получил: $computerThrow")

    if (playerThrow == computerThrow) {
        println("Ничья!")
    } else if (playerThrow > computerThrow) {
        println("Победил игрок!")
        counterUserVictory++
    } else {
        println("Победил компьютер!")
    }
}