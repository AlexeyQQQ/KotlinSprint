package lesson_11

fun main() {
    val userAlex = User2(0, "admin", "01234567", "mail@gmail.com")

    userAlex.printInfo()
    println()

    userAlex.changeBio()
    userAlex.changePassword()
    userAlex.printInfo()
}


class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "Не заполнили",
) {
    fun printInfo() {
        println(
            """
            Информация о пользователе $id:
            - Логин: $login
            - Пароль: $password
            - Почта: $email
            - Биография: $bio
        """.trimIndent()
        )
    }

    fun changeBio() {
        println("Введите информацию о себе:")
        bio = readln()
    }

    fun changePassword() {
        println("Введите старый пароль:")
        if (password == readln()) {
            println("Введите новый пароль:")
            password = readln()
            println("Пароль изменен!")
        } else {
            println("Вы ввели неправильный пароль!")
        }
    }
}