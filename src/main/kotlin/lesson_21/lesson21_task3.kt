package lesson_21

fun main() {
    val playerJohn = Player21("John", 20)
    val playerAlan = Player21("Alan", 100)

    println(playerJohn.isHealthy())
    println(playerAlan.isHealthy())
}

fun Player21.isHealthy(): Boolean = this.health == this.maxHealth


class Player21(
    var name: String,
    var health: Int,
) {
    val maxHealth = 100
}