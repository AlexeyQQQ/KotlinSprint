package lesson_18

fun main() {
    val animals = listOf(
        Fox("Лиса"),
        Dog("Собака"),
        Cat("Кошка"),
    )

    animals.forEach { it.eat() }
}


abstract class AnimalLesson18(
    val name: String,
) {

    open fun play() {
        println("$name играет")
    }

    open fun sleep() {
        println("$name спит")
    }

    open fun eat() {
        println("$name ест")
    }
}


class Fox(
    name: String,
) : AnimalLesson18(name) {

    override fun eat() {
        println("$name ест ягоды")
    }
}


class Dog(
    name: String,
) : AnimalLesson18(name) {

    override fun eat() {
        println("$name ест кости")
    }
}


class Cat(
    name: String,
) : AnimalLesson18(name) {

    override fun eat() {
        println("$name ест рыбу")
    }
}