package lesson_15

fun main() {
    val guitar = MusicalInstrument("Guitar", 10)
    guitar.selectionAccessories()
}


abstract class Product() {
    abstract val name: String
    abstract val number: Int
}


interface Selection {
    fun selectionAccessories() {
        println("Выполняется поиск...")
    }
}


class MusicalInstrument(
    override val name: String,
    override val number: Int,
) : Product(), Selection {

    override fun selectionAccessories() {
        println("Выполняется поиск аксессуаров для $name")
    }
}


class Accessories(
    override val name: String,
    override val number: Int,
) : Product()