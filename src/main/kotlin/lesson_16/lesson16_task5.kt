package lesson_16

fun main() {
    val player = Player("NAGIBATOR_2014")

    repeat(5) {
        player.printInfo()
        player.damage(35)
        player.heal(10)
        println()
    }
}


class Player(
    var name: String,
    private var health: Int = 100,
    private var strength: Int = 30,
) {
    fun printInfo() {
        println(
            """
            У персонажа $name:
            - $health% здоровья
            - $strength сила удара
        """.trimIndent()
        )
    }

    fun damage(value: Int) {
        if (health <= 0) {
            println("Персонаж уже мертв! Ему нельзя нанести урон.")
            return
        }
        health -= value
        if (health <= 0) {
            kill()
        }
    }

    fun heal(value: Int) {
        if (health <= 0) {
            println("Персонаж уже мертв! Его нельзя вылечить.")
            return
        }
        health += value
    }

    private fun kill() {
        health = 0
        strength = 0
        println("Вы проиграли!")
    }
}