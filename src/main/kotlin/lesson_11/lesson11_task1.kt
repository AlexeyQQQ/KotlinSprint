package lesson_11

fun main() {
    val userAlex = User(0, "admin", "01234567", "mail@gmail.com")
    userAlex.printInfo()
}


class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
) {

    fun printInfo() {
        println(
            """
            Информация о пользователе $id:
            - Логин: $login
            - Пароль: $password
            - Почта: $email
        """.trimIndent()
        )
    }

}