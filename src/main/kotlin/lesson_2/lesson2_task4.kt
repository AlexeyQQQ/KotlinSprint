package lesson_2

fun main() {
    val buff = 20
    val crystalOre = 7
    val ironOre = 11

    val percentRate = 1 + buff.toDouble() / 100
    val bonusCrystalOre = crystalOre * percentRate - crystalOre
    val bonusIronOre = ironOre * percentRate - ironOre

    println("Crystal Ore bonus: ${bonusCrystalOre.toInt()}")
    println("Iron Ore bonus: ${bonusIronOre.toInt()}")
}