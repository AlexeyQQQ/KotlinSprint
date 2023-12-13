package lesson_16

fun main() {
    val dice = Dice()
    println(dice.getNumber())

    dice.rollDice()
    println(dice.getNumber())
}


class Dice {
    private var number: Int = (1..6).random()

    fun getNumber() = number

    fun rollDice() {
        number = (1..6).random()
    }
}