package lesson_13

fun main() {
    val listOfPhoneUsers = mutableListOf(
        PhoneUser3("John", 79881112233),
        PhoneUser3("Alex", 79881112233, null),
        PhoneUser3("Nick", 79881112233, "Компания 1"),
        PhoneUser3("Paul", 79881112233, "Компания 2"),
        PhoneUser3("Max", 79881112233, "null"),
    )

    for (i in listOfPhoneUsers) {
        i.printInfo()
    }
}


class PhoneUser3(
    var name: String,
    var phone: Long,
    var company: String? = null,
) {
    fun printInfo() {
        println("Имя: $name.\nНомер: $phone.\nКомпания: ${company ?: "<не указано>"}.")
    }
}