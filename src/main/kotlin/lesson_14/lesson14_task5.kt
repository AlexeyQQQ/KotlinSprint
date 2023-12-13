package lesson_14

fun main() {
    val chat = Chat()

    val alex = chat.createNewUser("Alex")
    val john = chat.createNewUser("John")

    val parentId1 = chat.addMessage(alex, "Привет")
    chat.addThreadMessage(john, parentId1, "Здравствуйте!")
    chat.addThreadMessage(alex, parentId1, "Как дела?")
    chat.addThreadMessage(john, parentId1, "Нормально, а у тебя?")

    val parentId2 = chat.addMessage(alex, "Го в эту ветку!")
    chat.addThreadMessage(john, parentId2, "Пришел...")
    chat.addThreadMessage(alex, parentId2, "Отлично!")

    val parentId3 = chat.addMessage(john, "Тут тоже ветка есть!")
    chat.addThreadMessage(john, parentId3, "Аууу... есть тут кто?")
    chat.addThreadMessage(john, parentId3, "Видимо нет...")

    chat.printChat()
}


class Chat {
    private val listOfUsers = mutableListOf<ChatUser>()
    private val listOfMessages = mutableListOf<Message>()
    private val listOfChildMessages = mutableListOf<ChildMessage>()

    private var counterUserId = 0
    private var counterMessageId = 0

    fun createNewUser(userName: String): ChatUser {
        val user = ChatUser(counterUserId++, userName)
        listOfUsers.add(user)
        return user
    }

    fun addMessage(user: ChatUser, userMessage: String): Int {
        for (i in listOfUsers) {
            if (i.userId == user.userId) {
                val message = Message(
                    messageId = counterMessageId++,
                    authorId = user.userId,
                    authorName = user.userName,
                    message = userMessage
                )
                listOfMessages.add(message)
                return message.messageId
            }
        }
        return -1
    }

    fun addThreadMessage(user: ChatUser, parentMessageId: Int, userMessage: String) {
        for (i in listOfUsers) {
            if (i.userId == user.userId) {
                val childMessage = ChildMessage(
                    counterMessageId++,
                    authorId = user.userId,
                    authorName = user.userName,
                    message = userMessage,
                    parentMessageId = parentMessageId
                )
                listOfChildMessages.add(childMessage)
                return
            }
        }
    }

    fun printChat() {
        val threads = listOfChildMessages.groupBy { it.parentMessageId }
        for (i in threads) {
            for (message in listOfMessages) {
                if (i.key == message.messageId) {
                    println("${message.authorName}: ${message.message}")
                    break
                }
            }
            for (chMessage in i.value) {
                println("   ${chMessage.authorName}: ${chMessage.message}")
            }
            println("----------")
        }
    }
}


open class Message(
    val messageId: Int,
    val authorId: Int,
    val authorName: String,
    val message: String,
)


class ChildMessage(
    messageId: Int,
    authorId: Int,
    authorName: String,
    message: String,
    val parentMessageId: Int,
) : Message(messageId, authorId, authorName, message)


class ChatUser(
    val userId: Int,
    val userName: String,
)









