package lesson_19

fun main() {
    val listOfPeople = mutableListOf<Human>()

    while (listOfPeople.size < 5) {
        println("Ведите имя человека:")
        val userName = readln()

        println("Ведите пол человека (М или Ж):")
        var gender: Gender? = null
        when (readln()) {
            Gender.MALE.input -> gender = Gender.MALE
            Gender.FEMALE.input -> gender = Gender.FEMALE
            else -> println("Вы что-то перепутали, попробуйте заново")
        }

        gender?.let { listOfPeople.add(Human(userName, it)) }
    }

    listOfPeople.forEach { it.printInfo() }
}


enum class Gender(val input: String, val output: String) {
    MALE("М", "мужского"),
    FEMALE("Ж", "женского"),
}


class Human(
    val name: String,
    val gender: Gender,
) {
    fun printInfo() {
        println("Человек по имени $name ${gender.output} пола")
    }
}