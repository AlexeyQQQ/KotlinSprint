package lesson_16

fun main() {
    val user = NewUser("admin", "a12345")

    println(user.login)
    user.checkPassword("54321a")
    user.checkPassword("a12345")
}


class NewUser(
    public val login: String,
    private val password: String,
) {

    fun checkPassword(string: String) {
        if (password == string) {
            println("Пароль введен верно!")
        } else {
            println("Пароль не совпадает!")
        }
    }
}