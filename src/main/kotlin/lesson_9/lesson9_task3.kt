package lesson_9

fun main() {
    val listOfIngredients = listOf(2, 50, 15)

    println("Сколько порций омлета вы хотите сделать?")
    val numberOfPortions = readln().toInt()
    val userListOfIngredients = listOfIngredients.map { it * numberOfPortions }

    println(
        """
        На $numberOfPortions порций вам понадобится:
        Яиц – ${userListOfIngredients[0]}шт, молока – ${userListOfIngredients[1]}мл, сливочного масла – ${userListOfIngredients[2]}гр]
        """.trimIndent()
    )
}