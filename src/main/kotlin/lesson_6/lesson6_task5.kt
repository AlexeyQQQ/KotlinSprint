package lesson_6

fun main() {
    var number1: Int
    var number2: Int
    var userAnswer: Int
    var counterOfSolutions = 3

    println("Для входа в приложение докажите, что вы не бот.")
    do {
        if (counterOfSolutions > 0) {
            number1 = (1..9).random()
            number2 = (1..9).random()
            println("У вас ${counterOfSolutions--} попытки. Решите пример: $number1 + $number2 = ?")
            userAnswer = readln().toInt()
        } else {
            println("Доступ запрещен!")
            return
        }
    } while (userAnswer != number1 + number2)

    println("Добро пожаловать! Создайте логин:")
    val name = readln()
    println("Создайте пароль:")
    val password = readln()

    var userName: String
    var userPassword: String
    var counterOfLoginAttempts = 0

    do {
        if (counterOfLoginAttempts > 0) println("Данные введены неправильно. Попробуйте еще раз.")
        println("Введите логин:")
        userName = readln()
        println("Введите пароль:")
        userPassword = readln()
        counterOfLoginAttempts++
    } while (name != userName || password != userPassword)

    println("Авторизация прошла успешно!")
}