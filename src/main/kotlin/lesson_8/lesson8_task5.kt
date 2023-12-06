package lesson_8

fun main() {
    println("Сколько ингредиентов будет в рецепте?")
    val arrayOfIngredients = arrayOfNulls<String>(readln().toInt())

    for (i in arrayOfIngredients.indices) {
        println("Введите ингредиент ${i + 1}")
        arrayOfIngredients[i] = readln()
    }

    println("Готово! Вы сохранили следующий список:\n${arrayOfIngredients.joinToString()}")
}