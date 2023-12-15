package lesson_19

fun main() {
    println("Вы можете добавить в свой аквариум:")
    for (i in Aquarium.values()) println(i.fishName)
}


enum class Aquarium(val fishName: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок"),
}