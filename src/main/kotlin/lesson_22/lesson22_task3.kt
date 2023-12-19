package lesson_22

fun main() {
    val user = User23("John", 20, 65.4)

    val (name, age, weight) = user
    println(name)
    println(age)
    println(weight)
}


data class User23(
    val name: String,
    val age: Int,
    val weight: Double,
)