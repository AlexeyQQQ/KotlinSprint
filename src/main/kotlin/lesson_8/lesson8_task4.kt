package lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("огурец", "помидор", "перец", "масло", "соль")

    println(
        """
        Список ингредиентов для рецепта:
        ${arrayOfIngredients.joinToString()}
        Какой вы желаете заменить?
    """.trimIndent()
    )

    val userIngredient = readln()

    if (arrayOfIngredients.contains(userIngredient)) {
        val index = arrayOfIngredients.indexOf(userIngredient)
        println("Какой ингредиент вы хотите добавить?")
        arrayOfIngredients[index] = readln()
        println("Готово! Вы сохранили следующий список:\n${arrayOfIngredients.joinToString()}")
    } else {
        println("Ингредиента $userIngredient в рецепте нет!")
    }
}