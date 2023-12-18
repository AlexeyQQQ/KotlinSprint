package lesson_20

fun main() {
    val userName = readln()
    val wishHappyNewYear: (String) -> String = { name: String ->
        "С наступающим Новым Годом, $name!"
    }

    println(wishHappyNewYear(userName))
}