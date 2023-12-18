package lesson_18

fun main() {
    val boxes: List<Box> = listOf(
        Cube(10),
        Parallelepiped(2, 4, 6)
    )

    boxes.forEach { println(it.surfaceArea()) }
}


abstract class Box {
    abstract fun surfaceArea(): Int
}


class Cube(
    val lengthOfEdge: Int,
) : Box() {

    override fun surfaceArea(): Int = 6 * (lengthOfEdge * lengthOfEdge)
}


class Parallelepiped(
    val length: Int,
    val width: Int,
    val height: Int,
) : Box() {

    override fun surfaceArea(): Int = 2 * (length * width + width * height + length * height)
}