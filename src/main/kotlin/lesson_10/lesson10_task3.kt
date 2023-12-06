package lesson_10

fun main() {
    println("Вас приветствует генератор паролей \"ГП-5000\".\nВведите необходимое кол-во символов:")

    val userPassword = generatePassword(readln().toInt())

    println("Ваш пароль: $userPassword")
}

fun generatePassword(passwordLength: Int): String {
    val rangeNum = 0..9
    val rangeSym = ' '..'/'
    var password = ""

    for (i in 1..passwordLength) {
        if (password.length % 2 == 0) password += rangeNum.random()
        else password += rangeSym.random()
    }

    return password
}