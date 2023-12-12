package lesson_13

fun main() {
    val user = PhoneUser2("John", 79881112233)
    user.printInfo()
}

class PhoneUser2(
    var name: String,
    var phone: Long,
    var company: String? = null,
) {
    fun printInfo() {
        println("Имя: $name.\nНомер: $phone.\nКомпания: ${company ?: "<не указано>"}.")
    }
}