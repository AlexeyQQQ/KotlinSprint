package lesson_22

fun main() {
    val regularBook = RegularBook("Название", "Автор")
    val regularBook2 = RegularBook("Название", "Автор")

    val dataBook = DataBook("Название", "Автор")
    val dataBook2 = DataBook("Название", "Автор")

    println(regularBook == regularBook2)    //false - equals не переопределен, идет сравнение ссылок
    println(regularBook === regularBook2)   //false - у разных объектов разные ссылки в стеке

    println(dataBook == dataBook2)  //true - объекты равны по equals и hashcode
    println(dataBook === dataBook2) //false - у разных объектов разные ссылки в стеке
}


class RegularBook(
    val title: String,
    val author: String,
)


data class DataBook(
    val title: String,
    val author: String,
)