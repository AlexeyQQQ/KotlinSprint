package lesson_10

fun main() {
    val playerThrow = throwDice()
    val computerThrow = throwDice()

    outputResult(playerThrow, computerThrow)
}

fun throwDice(): Int = (1..6).random()

fun outputResult(playerThrow: Int, computerThrow: Int) {
    println("Игрок бросил кубики и получил: $playerThrow")
    println("Компьютер бросил кубики и получил: $computerThrow")

    if (playerThrow == computerThrow) println("Ничья!")
    else if (playerThrow > computerThrow) println("Победил игрок!")
    else println("Победил компьютер!")
}