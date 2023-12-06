package lesson_6

fun main() {
    println("Введите кол-во секунд для таймера:")
    val userCounter = readln().toInt()
    var counter = userCounter

    while (counter > 0) {
        println("Осталось секунд: ${counter--}")
        Thread.sleep(1000)
    }

    println("Осталось секунд: ${counter--}\nВремя вышло.")
}