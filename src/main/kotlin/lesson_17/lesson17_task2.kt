package lesson_17

fun main() {
    val ship = Ship("Тайга", 100, "Владивосток")
    println(ship.name)

    ship.name = "Степь"
    println(ship.name)
}


class Ship(
    _name: String,
    var speed: Int,
    var port: String,
) {
    var name = _name
        set(value) {
            println("Нельзя поменять имя корабля!")
        }
}