package lesson_20

fun main() {
    val listOfElements = listOf(
        "Кнопка 00",
        "Кнопка 01",
        "Кнопка 02",
        "Кнопка 03",
        "Кнопка 04",
        "Кнопка 05",
    )

    val filteredElements = listOfElements
        .map { element: String ->
            { println("Нажат элемент $element") }
        }.filterIndexed { index, function ->
            index % 2 == 0
        }

    filteredElements.forEach { it() }
}