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
        generateToken()
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

fun generateToken(): String {
    var token = ""
    val listOfRanges = listOf(('0'..'9'), ('a'..'z'), ('A'..'Z'))

    repeat(32) {
        token += listOfRanges.random().random()
    }

    return token
}