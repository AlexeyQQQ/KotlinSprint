package lesson_14

fun main() {
    val liner = Liner2()
    val cargo = Cargo2()
    val icebreaker = Icebreaker2()

    println(liner)
    liner.loadCargo()
    println()

    println(cargo)
    cargo.loadCargo()
    println()

    println(icebreaker)
    icebreaker.loadCargo()
    println()
}


open class Liner2(
    val speed: Int = 100,
    val loadCapacity: Int = 10000,
    val peopleCapacity: Int = 200,
) {

    open fun loadCargo() {
        println("Выдвигаю горизонтальный трап со шкафута")
    }

    override fun toString(): String {
        return "Liner(speed=$speed, loadCapacity=$loadCapacity, peopleCapacity=$peopleCapacity)"
    }
}


class Cargo2(
    speed: Int = 40,
    loadCapacity: Int = 50000,
    peopleCapacity: Int = 30,
) : Liner2(speed, loadCapacity, peopleCapacity) {

    override fun loadCargo() {
        println("Активирую погрузочный кран")
    }

    override fun toString(): String {
        return "Cargo(speed=$speed, loadCapacity=$loadCapacity, peopleCapacity=$peopleCapacity)"
    }
}


class Icebreaker2(
    speed: Int = 60,
    loadCapacity: Int = 6000,
    peopleCapacity: Int = 80,
    val isCanCrackIce: Boolean = true,
) : Liner2(speed, loadCapacity, peopleCapacity) {

    override fun loadCargo() {
        println("Открываю ворота со стороны кормы")
    }

    override fun toString(): String {
        return "Icebreaker(speed=$speed, loadCapacity=$loadCapacity, " +
                "peopleCapacity=$peopleCapacity, isCanCrackIce=$isCanCrackIce)"
    }
}