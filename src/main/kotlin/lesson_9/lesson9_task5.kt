package lesson_9

fun main() {
    val listOfIngredients = mutableListOf<String>()

    while (listOfIngredients.size != 5) {
        println("Введите ингредиент ${listOfIngredients.size + 1}:")
        listOfIngredients.add(readln())
    }
    println("Исходная строка: ${listOfIngredients.joinToString()}")

    val convertedList = listOfIngredients.distinct().sorted()
    println(
        "Строка без повторов, в алфавитном порядке, с заглавной буквы:\n" +
                convertedList.joinToString().substring(0, 1).uppercase()
                + convertedList.joinToString().substring(1).lowercase()
    )
}