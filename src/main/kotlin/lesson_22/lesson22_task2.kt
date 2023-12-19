package lesson_22

fun main() {
    val regularBook = RegularBook2("Название", "Автор")
    val dataBook = DataBook2("Название", "Автор")

    println(regularBook)    // Выведет название класса @ шестнадцатеричный хэш-код, т.к. не переопределен toString
    println(dataBook)   // Выведет информацию об объекте (класс и поля), т.к. переопределен toString
}


class RegularBook2(
    val title: String,
    val author: String,
)


data class DataBook2(
    val title: String,
    val author: String,
)