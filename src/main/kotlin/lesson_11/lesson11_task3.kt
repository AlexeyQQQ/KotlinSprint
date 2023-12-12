package lesson_11

fun main() {
    val chat = ChatRoom(
        "ссылка на обложку",
        "Комната чата 01",
        listOf(
            ChatUser("Alex", "ссылка на аватар"),
            ChatUser("John", "ссылка на аватар", UserStatus.LISTENING.status),
            ChatUser("Nick", "ссылка на аватар", UserStatus.TALKING.status)
        )
    )

    val chatFeed = ChatFeed(listOf(chat))
}


class ChatFeed(
    val listOfRooms: List<ChatRoom>,
)


class ChatRoom(
    val cover: String,
    val name: String,
    val listOfUsers: List<ChatUser>,
) {
    fun showNickname(chatUser: ChatUser) {
        println(chatUser.nickname)
    }
}


class ChatUser(
    val nickname: String,
    val avatar: String,
    var status: String = UserStatus.MUTED.status,
) {
    fun changeStatus(userStatus: UserStatus) {
        status = userStatus.status
    }
}


enum class UserStatus(val status: String) {
    TALKING("пользователь разговаривает"),
    LISTENING("микрофон выключен"),
    MUTED("пользователь заглушен"),
}