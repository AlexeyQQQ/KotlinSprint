package lesson_15

fun main() {
    val user1 = UserForum(1, "Max", "1234")
    val admin1 = AdminForum(1, "John", "1234")

    user1.readForum()
    user1.writeMessage()

    admin1.readForum()
    admin1.writeMessage()
    admin1.deleteMessage()
    admin1.deleteUser(user1)
}


abstract class PeopleOfForum(
    val id: Int,
    val name: String,
    val password: String,
) {
    abstract fun readForum()
    abstract fun writeMessage()
}


class UserForum(
    id: Int,
    name: String,
    password: String,
) : PeopleOfForum(id, name, password) {

    override fun readForum() {
        println("Пользователь $name читает форум")
    }

    override fun writeMessage() {
        println("Пользователь $name печатает сообщение")
    }
}


class AdminForum(
    id: Int,
    name: String,
    password: String,
    val isAdmin: Boolean = true,
) : PeopleOfForum(id, name, password) {

    override fun readForum() {
        println("Админ $name читает форум")
    }

    override fun writeMessage() {
        println("Админ $name печатает сообщение")
    }

    fun deleteMessage() {
        println("Админ $name удаляет сообщение")
    }

    fun deleteUser(userForum: UserForum) {
        println("Админ $name удаляет пользователя ${userForum.name}")
    }
}
