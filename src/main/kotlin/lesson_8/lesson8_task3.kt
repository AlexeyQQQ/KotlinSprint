package lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("огурец", "помидор", "перец", "масло", "соль")

    println("Какой ингредиент вы хотите найти?")
    val userIngredient = readln()

    if (arrayOfIngredients.contains(userIngredient)) {
        println("Ингредиент $userIngredient в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}