package lesson_9

fun main() {
    val setOfIngredients = mutableSetOf<String>()

    for (i in 1..5) {
        println("Введите ингредиент ${i}:")
        setOfIngredients.add(readln())
    }
    println("Исходная строка: ${setOfIngredients.joinToString()}")

    val convertedList = setOfIngredients.sorted()
    println(
        "Строка без повторов, в алфавитном порядке, с заглавной буквы:\n" +
                convertedList.joinToString().substring(0, 1).uppercase()
                + convertedList.joinToString().substring(1).lowercase()
    )
}