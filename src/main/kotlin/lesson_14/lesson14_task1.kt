package lesson_14

fun main() {
    val liner = Liner()
    val cargo = Cargo()
    val icebreaker = Icebreaker()
}


open class Liner(
    val speed: Int = 100,
    val loadCapacity: Int = 10000,
    val peopleCapacity: Int = 200,
)


class Cargo(
    speed: Int = 40,
    loadCapacity: Int = 50000,
    peopleCapacity: Int = 30,
) : Liner(speed, loadCapacity, peopleCapacity)


class Icebreaker(
    speed: Int = 60,
    loadCapacity: Int = 6000,
    peopleCapacity: Int = 80,
    val isCanCrackIce: Boolean = true,
) : Liner(speed, loadCapacity, peopleCapacity)