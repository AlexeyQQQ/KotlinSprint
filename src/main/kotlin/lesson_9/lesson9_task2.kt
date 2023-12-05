package lesson_9

fun main() {
    val listOfIngredients = mutableListOf("огурец", "помидор", "перец")

    println(
        """
        В рецепте есть базовые ингредиенты: ${listOfIngredients.joinToString()}
        Желаете добавить еще?
    """.trimIndent()
    )

    if (readln() == "да") {
        println("Какой ингредиент вы хотите добавить?")
        listOfIngredients.add(readln())
    } else {
        println("Рецепт не изменен!")
        return
    }

    println("Теперь в рецепте есть следующие ингредиенты: ${listOfIngredients.joinToString()}")
}