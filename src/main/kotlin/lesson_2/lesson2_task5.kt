package lesson_2

import kotlin.math.pow

fun main() {
    val sumFromClient = 70_000
    val percentRate = 16.7
    val depositPeriod = 20

    val result = sumFromClient * (1 + percentRate / 100).pow(depositPeriod)

    println(String.format("%.3f", result))
}