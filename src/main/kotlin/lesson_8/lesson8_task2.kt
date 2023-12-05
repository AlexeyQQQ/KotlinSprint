package lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("огурец", "помидор", "перец", "масло", "соль")

    println("Какой ингредиент вы хотите найти?")
    val userIngredient = readln()

    for (i in arrayOfIngredients) {
        if (i == userIngredient) {
            println("Ингредиент $i в рецепте есть")
            return
        }
    }

    println("Такого ингредиента в рецепте нет")
}