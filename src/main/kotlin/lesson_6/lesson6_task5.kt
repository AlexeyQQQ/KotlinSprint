package lesson_6

fun main() {
    var number1 = (1..9).random()
    var number2 = (1..9).random()
    var counter = 3

    println(
        "Для входа в приложение докажите, что вы не бот. У вас ${counter--} попытки."
                + "\nРешите пример: $number1 + $number2 = ?"
    )
    var userAnswer = readln().toInt()

    while (userAnswer != number1 + number2) {
        if (counter > 0) {
            number1 = (1..9).random()
            number2 = (1..9).random()
            println("Неверно! Кол-во оставшихся попыток: ${counter--}.\nРешите новый пример: $number1 + $number2 = ?")
            userAnswer = readln().toInt()
        } else {
            println("Доступ запрещен!")
            return
        }
    }

    println("Добро пожаловать! Создайте логин:")
    val name = readln()
    println("Создайте пароль:")
    val password = readln()

    println("Введите логин:")
    var userName = readln()
    println("Введите пароль:")
    var userPassword = readln()

    while (name != userName || password != userPassword) {
        println("Данные введены неправильно. Попробуйте еще раз.\nВведите логин:")
        userName = readln()
        println("Введите пароль:")
        userPassword = readln()
    }

    println("Авторизация прошла успешно!")
}