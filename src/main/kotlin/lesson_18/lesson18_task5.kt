package lesson_18

fun main() {
    val screen = Screen()
    val objectsToDraw: List<ObjectToDraw> = listOf(
        Circle18(),
        Square18(),
        Dot18(),
    )

    objectsToDraw.forEach {
        screen.draw(it, 10, 10)
        screen.draw(it, 4.2f, 4.2f)
        screen.draw(it, 10, 4.2f)
        screen.draw(it, 4.2f, 10)
        println()
    }
}


abstract class ObjectToDraw {
    abstract val name: String
}


class Circle18 : ObjectToDraw() {
    override val name: String = "Круг"
}


class Square18 : ObjectToDraw() {
    override val name: String = "Квадрат"
}


class Dot18 : ObjectToDraw() {
    override val name: String = "Точка"
}


class Screen {
    fun draw(obj: ObjectToDraw, coordinateX: Int, coordinateY: Int) {
        println("Нарисован ${obj.name} c координатами $coordinateX:$coordinateY")
    }

    fun draw(obj: ObjectToDraw, coordinateX: Float, coordinateY: Float) {
        println("Нарисован ${obj.name} c координатами $coordinateX:$coordinateY")
    }

    fun draw(obj: ObjectToDraw, coordinateX: Int, coordinateY: Float) {
        println("Нарисован ${obj.name} c координатами $coordinateX:$coordinateY")
    }

    fun draw(obj: ObjectToDraw, coordinateX: Float, coordinateY: Int) {
        println("Нарисован ${obj.name} c координатами $coordinateX:$coordinateY")
    }
}