package lesson_16

fun main() {
    val order = Order(10, "Обрабатывается")

    println(order.getNumber())
    println(order.getStatus())

    order.sendRequestToManager("Собирается")
    println(order.getStatus())
}


class Order(
    private val number: Int,
    private var status: String,
) {

    fun getNumber() = number

    fun getStatus() = status

    private fun changeStatus(newStatus: String) {
        status = newStatus
    }

    fun sendRequestToManager(newStatus: String) {
        this.changeStatus(newStatus)
    }
}
