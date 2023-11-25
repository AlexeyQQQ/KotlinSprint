package lesson_4

const val IS_SUNNY_WEATHER = true
const val IS_AWNING_OPEN = true
const val AIR_DAMP = 20
const val WINTER = "Зима"

fun main() {
    val isSunny: Boolean = true
    val isAwningOpen: Boolean = true
    val damp: Int = 20
    val season: String = "Зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? ${
            isSunny == IS_SUNNY_WEATHER
                    && isAwningOpen == IS_AWNING_OPEN
                    && damp == AIR_DAMP
                    && season != WINTER
        }"
    )
}