package lesson_9

fun main() {
    println("Напишите 5 ингредиентов для блюда:")
    val listOfIngredients = readln().split(", ")

    val sortedIngredients = listOfIngredients.sorted()

    println("Ваш список в алфавитном порядке: ${sortedIngredients.joinToString()}")
}