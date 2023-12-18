package lesson_20

fun main() {
    val playerJohn = Player20("John", 70)
    println(playerJohn)

    val heal: (Player20) -> Unit = { player: Player20 ->
        player.health = player.maxHealth
        println("Игрок ${player.name} полностью вылечен!")
    }

    heal(playerJohn)
    println(playerJohn)
}


class Player20(
    var name: String,
    var health: Int,
) {
    val maxHealth = 100

    override fun toString(): String {
        return "Player20(name='$name', health=$health, maxHealth=$maxHealth)"
    }
}