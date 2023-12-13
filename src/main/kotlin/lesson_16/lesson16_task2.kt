package lesson_16

fun main() {
    val redCircle = Circle(10.0)
    println(
        "Площадь: ${String.format("%.2f", redCircle.area())}." +
                "\nПериметр: ${String.format("%.2f", redCircle.perimeter())}."
    )
}


class Circle(
    private val radius: Double,
) {
    private val pi: Double = 3.14

    fun area() = pi * radius * radius

    fun perimeter() = 2 * pi * radius
}