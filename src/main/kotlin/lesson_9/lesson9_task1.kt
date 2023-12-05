package lesson_9

fun main() {
    val listOfIngredients = listOf("огурец", "помидор", "перец", "масло", "соль")

    println("В рецепте есть следующие ингредиенты: ${listOfIngredients.joinToString()}")

    listOfIngredients.forEach {
        println(it)
    }
}