package lesson_17

fun main() {
    val myPackage = MyPackage(4545, "Москва")
    println(myPackage.movementCounter)

    myPackage.location = "Красноярск"
    println(myPackage.movementCounter)

    myPackage.location = "Владивосток"
    println(myPackage.movementCounter)
}


class MyPackage(
    _number: Int,
    _location: String,
) {
    val number = _number

    var location = _location
        set(value) {
            field = value
            movementCounter++
        }

    var movementCounter = 0
}