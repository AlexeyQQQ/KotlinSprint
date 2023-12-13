package lesson_13

fun main() {
    val listOfPhoneUsers = mutableListOf<PhoneUser4>()

    do {
        println("Введите имя контакта:")
        val name = readln()

        println("Введите номер телефона:")
        val phone = readln().toLongOrNull()

        println("Введите название компании или пропустите поле с помощью, нажав Enter:")
        var company = readlnOrNull()
        if (company == "") company = null

        if (phone == null) {
            println("Вы не ввели номер телефона, контакт не будет добавлен!")
        } else {
            listOfPhoneUsers.add(PhoneUser4(name, phone, company))
        }

        println("Если вы больше не хотите добавлять контакты, напишите СТОП:")
    } while (readln().lowercase() != "стоп")

    for (i in listOfPhoneUsers) {
        i.printInfo()
    }
}


class PhoneUser4(
    var name: String,
    var phone: Long,
    var company: String? = null,
) {
    fun printInfo() {
        println("Имя: $name.\nНомер: $phone.\nКомпания: ${company ?: "<не указано>"}.")
    }
}