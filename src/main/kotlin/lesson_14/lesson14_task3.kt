package lesson_14

import kotlin.math.*

fun main() {
    val listOfFigures = mutableListOf(
        Circle("white", 1.0),
        Circle("white", 1.0),
        Rectangle("white", 1.0, 1.0),
        Circle("black", 2.0),
        Circle("black", 2.0),
        Rectangle("black", 2.0, 2.0),
    )

    val sumOfWhiteArea = listOfFigures.filter { it.color == "white" }.sumOf { it.area() }
    val sumOfBlackPerimeter = listOfFigures.filter { it.color == "black" }.sumOf { it.perimeter() }

    println("Сумма площадей всех белых фигур: $sumOfWhiteArea")
    println("Сумма периметров всех черных фигур: $sumOfBlackPerimeter")
}


abstract class Figure(
    val color: String,
) {
    abstract fun area(): Double
    abstract fun perimeter(): Double
}


class Circle(
    color: String,
    val radius: Double,
) : Figure(color) {

    override fun area(): Double = PI * radius.pow(2)

    override fun perimeter(): Double = 2 * PI * radius
}


class Rectangle(
    color: String,
    val width: Double,
    val height: Double,
) : Figure(color) {

    override fun area(): Double = width * height

    override fun perimeter(): Double = (width + height) * 2
}