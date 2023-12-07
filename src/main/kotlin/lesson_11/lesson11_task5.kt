package lesson_11

fun main() {
    val forum = Forum()

    val alex = forum.createNewUser("Alex")
    val john = forum.createNewUser("John")

    repeat(2) {
        forum.createNewMessage(alex.userId)
        forum.createNewMessage(john.userId)
        forum.createNewMessage(7777)
        forum.createNewMessage(456456)
    }

    forum.printThread()
}


class Forum() {
    private val listOfUsers = mutableListOf<ForumUser>()
    private val listOfMessages = mutableListOf<ForumMessage>()
    private var counterId = 0

    fun createNewUser(userName: String): ForumUser {
        val user = ForumUser(counterId++, userName)
        listOfUsers.add(user)
        return user
    }

    fun createNewMessage(userId: Int) {
        for (i in listOfUsers) {
            if (i.userId == userId) {
                val message = ForumMessage(userId, "Сообщение от пользователя c id $userId")
                listOfMessages.add(message)
            }
        }
    }

    fun printThread() {
        for (message in listOfMessages) {
            for (user in listOfUsers) {
                if (message.authorId == user.userId) {
                    println("${user.userName}: ${message.message}")
                }
            }
        }
    }
}


class ForumUser(
    val userId: Int,
    val userName: String,
) {}


class ForumMessage(
    val authorId: Int,
    val message: String,
) {}