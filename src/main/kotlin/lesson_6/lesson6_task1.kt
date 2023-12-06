package lesson_6

fun main() {
    println("Создайте логин:")
    val name = readln()
    println("Создайте пароль:")
    val password = readln()

    println("Введите логин:")
    var userName = readln()
    println("Введите пароль:")
    var userPassword = readln()

    while (name != userName || password != userPassword) {
        println("Данные введены неправильно. Попробуйте еще раз.")
        println("Введите логин:")
        userName = readln()
        println("Введите пароль:")
        userPassword = readln()
    }

    println("Авторизация прошла успешно!")
}