package lesson_7

fun main() {

    while (true) {
        val authorizationCode = (1000..9999).random()
        println("Ваш код авторизации: $authorizationCode.\nВведите код, чтобы войти:")
        val userCode = readln().toInt()

        if (authorizationCode == userCode) {
            println("Добро пожаловать!")
            return
        }

        println("Ошибка, попробуйте снова!")
    }
}