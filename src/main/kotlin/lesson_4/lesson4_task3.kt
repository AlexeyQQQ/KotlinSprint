package lesson_4

const val SUNNY_WEATHER = true
const val OPEN_TENT = true
const val AIR_DAMP = 20
const val WINTER = "Зима"

fun main() {
    val weather: Boolean = true
    val tent: Boolean = true
    val damp: Int = 20
    val season: String = "Зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? ${
            weather == SUNNY_WEATHER
                    && tent == OPEN_TENT
                    && damp == AIR_DAMP
                    && season != WINTER
        }"
    )
}