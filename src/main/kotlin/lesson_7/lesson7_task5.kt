package lesson_7

fun main() {
    var password: String
    var numberOfChars: Int
    val listOfRanges = listOf(('0'..'9'), ('a'..'z'), ('A'..'Z'))

    println("Вас приветствует генератор паролей \"ГП-3000\".\nВведите необходимое кол-во символов:")
    numberOfChars = readln().toInt()
    if (numberOfChars < 6) {
        println("Извините, минимальная длина 6 символов!")
        numberOfChars = 6
    }

    do {
        password = ""
        for (i in 0 until numberOfChars) {
            password += listOfRanges.random().random()
        }
    } while (
        !password.contains("[0-9]".toRegex())
        || !password.contains("[a-z]".toRegex())
        || !password.contains("[A-Z]".toRegex())
    )

    println("Ваш пароль: $password")
}