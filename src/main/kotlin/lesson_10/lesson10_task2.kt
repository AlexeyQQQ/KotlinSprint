package lesson_10

fun main() {
    println("Введите логин:")
    val userName = readln()
    println("Введите пароль:")
    val userPassword = readln()

    checkLength(userName, userPassword)
}

fun checkLength(name: String, password: String) {
    if (name.length < 4 || password.length < 4) {
        println("Логин или пароль недостаточно длинные!")
    } else {
        println("Добро пожаловать!")
    }
}