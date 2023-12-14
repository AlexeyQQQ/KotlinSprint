package lesson_17

fun main() {
    val user = UserLesson17("admin", "12345678")

    user.login = "ADMIN"
    println(user.login)

    user.password = "qwe"
    println(user.password)
}


class UserLesson17(
    _login: String,
    _password: String,
) {
    var login = _login
        set(value) {
            field = value
            println("Изменение логина прошло успешно!")
        }

    var password = _password
        set(value) = println("Вы не можете изменить пароль!")
        get() = "*".repeat(field.length)
}