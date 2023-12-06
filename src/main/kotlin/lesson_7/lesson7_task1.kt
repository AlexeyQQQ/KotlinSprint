package lesson_7

fun main() {
    val rangeNum = 0..9
    val rangeSym = 'a'..'z'
    var password = ""

    for (i in 1..3) {
        password += rangeSym.random()
        password += rangeNum.random()
    }

    println("Ваш пароль: $password")
}