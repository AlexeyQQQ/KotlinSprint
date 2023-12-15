package lesson_18

fun main() {
    val order1 = OrderLesson18()
    val order2 = OrderLesson18()

    order1.printOrderInfo(
        1,
        "Футболка"
    )

    order2.printOrderInfo(
        2,
        listOf("Джинсы", "Кепка", "Носки")
    )
}


class OrderLesson18 {

    fun printOrderInfo(
        number: Int,
        content: String,
    ) {
        println("Заказ $number содержит товар: $content")
    }

    fun printOrderInfo(
        number: Int,
        content: List<String>,
    ) {
        println("Заказ $number содержит следующие товары: ${content.joinToString()}")
    }
}