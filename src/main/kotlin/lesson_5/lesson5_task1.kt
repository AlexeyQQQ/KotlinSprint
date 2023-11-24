package lesson_5

fun main() {
    val num1 = (Math.random() * 10).toInt()
    val num2 = (Math.random() * 10).toInt()

    println("Докажите, что вы не робот. Решите пример: $num1 + $num2 = ?")

    val answer = readln().toInt()

    if (answer == num1 + num2) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}