package lesson_13

import kotlin.Exception

fun main() {
    try {
        println("Введите номер телефона:")
        val phone = readln().toLong()
    } catch (e: Exception) {
        println("Осторожно, вы поймали $e")
    }
}


class PhoneUser5(
    var name: String,
    var phone: Long,
    var company: String? = null,
) {
    fun printInfo() {
        println("Имя: $name.\nНомер: $phone.\nКомпания: ${company ?: "<не указано>"}.")
    }
}