package lesson_19

import lesson_19.Ammunition.*

fun main() {
    val tank = Tank()

    tank.shoot()

    tank.pickUpAmmo(BLUE)
    tank.shoot()

    tank.pickUpAmmo(GREEN)
    tank.shoot()

    tank.pickUpAmmo(RED)
    tank.shoot()
}


enum class Ammunition(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}


class Tank {
    private var ammo: Ammunition? = null

    fun pickUpAmmo(ammunition: Ammunition) {
        ammo = ammunition
    }

    fun shoot() {
        ammo?.let {
            println("Танк наносит ${it.damage} урона...")
        } ?: println("Танк еще не заряжен!")
    }
}