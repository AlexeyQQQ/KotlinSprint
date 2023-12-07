package lesson_11

fun main() {

}


class ChatFeed(
    val listOfRooms: List<ChatRoom>,
) {

}


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
    val status: String = "пользователь заглушен",
) {
    fun changeStatus() {}
}