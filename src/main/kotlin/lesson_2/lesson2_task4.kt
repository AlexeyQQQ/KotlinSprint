package lesson_2

fun main() {
    val buff = 1.2
    val crystalOre = 7
    val ironOre = 11

    val bonusCrystalOre = crystalOre * buff - crystalOre
    val bonusIronOre = ironOre * buff - ironOre

    println(bonusCrystalOre.toInt())
    println(bonusIronOre.toInt())
}