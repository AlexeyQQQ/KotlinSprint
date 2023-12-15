package lesson_19

import lesson_19.Categories19.*

fun main() {
    val listOfProducts = listOf(
        Product19("Плащ", 101, CLOTHING),
        Product19("Карандаш", 102, STATIONERY),
        Product19("Массажер", 103, OTHER),
    )

    listOfProducts.forEach { it.printInfo() }
}


enum class Categories19 {
    CLOTHING,
    STATIONERY,
    OTHER,
}


class Product19(
    private val name: String,
    private val id: Int,
    private val category: Categories19,
) {

    fun printInfo() {
        println("Товар $name c id $id находится в категории \"${getCategoryName(category)}\"")
    }
}


fun getCategoryName(category: Categories19): String {
    return when (category) {
        CLOTHING -> "Одежда"
        STATIONERY -> "Канцелярские товары"
        OTHER -> "Разное"
    }
}