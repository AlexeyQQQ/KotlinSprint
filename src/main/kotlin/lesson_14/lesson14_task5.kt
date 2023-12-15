package lesson_14

fun main() {
    val chat = Chat()

    val alex = chat.createNewUser("Alex")
    val john = chat.createNewUser("John")

    chat.addMessage(alex, "ТЕСТ, родительское 1")
    chat.addMessage(alex, "ТЕСТ, родительское 2")

    val parentThread1 = chat.addMessage(alex, "Привет")
    chat.addThreadMessage(john, parentThread1, "Здравствуйте!")
    chat.addThreadMessage(alex, parentThread1, "Как дела?")

    val parentThread2 = chat.addMessage(alex, "Го в эту ветку!")
    chat.addThreadMessage(john, parentThread2, "Пришел...")
    chat.addThreadMessage(alex, parentThread2, "Отлично!")

    chat.addMessage(john, "ТЕСТ, родительское в середине чата")

    val parentThread3 = chat.addMessage(john, "Тут тоже ветка есть! Как дела?")
    chat.addThreadMessage(john, parentThread3, "Аууу... ответит мне кто?")

    chat.addThreadMessage(john, parentThread1, "ТЕСТ, дочернее для треда parentThread1")
    chat.addThreadMessage(alex, parentThread2, "ТЕСТ, дочернее для треда parentThread2")
    chat.addThreadMessage(john, parentThread3, "ТЕСТ, дочернее для треда parentThread3")

    chat.addMessage(john, "ТЕСТ, родительское последнее")

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
        for (currentUser in listOfUsers) {
            if (currentUser.userId == user.userId) {
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
        for (parMessage in listOfMessages) {
            println("${parMessage.authorName}: ${parMessage.message}")
            if (threads.containsKey(parMessage.messageId)) {
                threads[parMessage.messageId]?.forEach {
                    println("   ${it.authorName}: ${it.message}")
                }
            }
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