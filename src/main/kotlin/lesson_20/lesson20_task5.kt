package lesson_20

fun main() {
    val robot = Robot20()
    robot.say()

    val invert: (String) -> String = { oldString: String ->
        val listOfWords = oldString.split(" ")
        var newString = ""
        for (i in listOfWords.size - 1 downTo 0) {
            newString += "${listOfWords[i]} "
        }
        newString
    }

    robot.setModifier(invert)
    robot.say()
}


class Robot20 {
    private val listOfPhrases = listOf(
        "Привет, как твои человеческие дела?",
        "Я единственный робот на планете?",
        "Принесите мне wd-40.",
        "Приделайте мне еще две руки.",
        "Первый чертеж человекоподобного робота создан в 1495 году.",
    )

    private var modifier: (String) -> String = { it }

    fun say() {
        println(modifier(listOfPhrases.random()))
    }

    fun setModifier(mod: (String) -> String) {
        modifier = mod
        println("Модификатор речи установлен!")
    }
}