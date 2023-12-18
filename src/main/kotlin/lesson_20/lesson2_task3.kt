package lesson_20

fun main() {
    val playerJohn = Player20task3("John")

    val openDoor: (Player20task3) -> Unit = { player: Player20task3 ->
        if (player.isHaveKey) println("Игрок ${player.name} открыл дверь!")
        else println("У игрока ${player.name} нет ключа!")
    }

    openDoor(playerJohn)
    playerJohn.isHaveKey = true
    openDoor(playerJohn)
}


class Player20task3(
    val name: String,
) {
    var isHaveKey = false
}