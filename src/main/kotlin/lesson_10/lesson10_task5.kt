package lesson_10

import java.lang.Exception

const val LOGIN = "user"
const val PASSWORD = "password"
const val CART = "В корзине что-то лежит..."

fun main() {
    println("Введите логин:")
    val userLogin = readln()
    println("Введите пароль:")
    val userPassword = readln()
    val userToken: String? = authorize(userLogin, userPassword)

    println(returnCart(userToken))
}

fun authorize(login: String, password: String): String? {
    return if (login == LOGIN && password == PASSWORD) {
        "eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9"
    } else {
        null
    }
}

fun returnCart(token: String?): String {
    return if (token != null) {
        CART
    } else {
        "Введен неправильный логин или пароль!"
    }
}