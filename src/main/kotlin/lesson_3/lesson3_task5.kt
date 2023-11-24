package lesson_3

fun main() {
    val moveFromPlayer = "D2-D4;0"

    val (start, end, moveNumber) = moveFromPlayer.split("-", ";")

    println(start)
    println(end)
    println(moveNumber)
}