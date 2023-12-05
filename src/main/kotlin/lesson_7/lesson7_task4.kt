package lesson_7

fun main() {
    println("Введите кол-во секунд для таймера:")

    for (i in readln().toInt() downTo 1) {
        println("Осталось секунд: $i")
        Thread.sleep(1000)
    }

    println("Осталось секунд: 0, время вышло.")
}