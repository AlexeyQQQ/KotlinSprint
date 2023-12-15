package lesson_18

fun main() {
    val dices: List<DiceLesson18> = listOf(Dice4Faces(), Dice6Faces(), Dice8Faces())

    dices.forEach { it.rollDice() }
}


abstract class DiceLesson18 {
    abstract val numberOfFaces: Int
    abstract fun rollDice()
}


class Dice4Faces : DiceLesson18() {
    override val numberOfFaces: Int = 4

    override fun rollDice() {
        println("Бросок $numberOfFaces-гранного кубика, выпало: ${(0..4).random()}")
    }
}


class Dice6Faces : DiceLesson18() {
    override val numberOfFaces: Int = 6

    override fun rollDice() {
        println("Бросок $numberOfFaces-гранного кубика, выпало: ${(0..6).random()}")
    }
}


class Dice8Faces : DiceLesson18() {
    override val numberOfFaces: Int = 8

    override fun rollDice() {
        println("Бросок $numberOfFaces-гранного кубика, выпало: ${(0..8).random()}")
    }
}