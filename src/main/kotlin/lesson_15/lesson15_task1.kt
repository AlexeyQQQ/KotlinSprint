package lesson_15

fun main() {
    val crucian = Crucian()
    val seagull = Seagull()
    val duck = Duck()

    crucian.sail()

    seagull.sail()
    seagull.takeOff()

    duck.sail()
    duck.takeOff()
}


class Crucian(
    val name: String = "Карась",
) : Floating {

    override fun sail() {
        println("$name плывет...")
    }
}


class Seagull(
    val name: String = "Чайка",
) : Floating, Flying {

    override fun takeOff() {
        println("$name летит...")
    }

    override fun sail() {
        println("$name плывет...")
    }
}


class Duck(
    val name: String = "Утка",
) : Floating, Flying {

    override fun takeOff() {
        println("$name летит...")
    }

    override fun sail() {
        println("$name плывет...")
    }
}


interface Flying {
    fun takeOff()
}


interface Floating {
    fun sail()
}