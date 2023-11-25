package lesson_4

const val IS_DAMAGE = true
const val MIN_CREW = 55
const val MAX_CREW = 70
const val PROVISIONS = 50
const val IS_GOOD_WEATHER = true

fun main() {
    println("Наличие повреждений корпуса (true/false):")
    val isDamage = readln().toBoolean()

    println("Текущий состав экипажа (число):")
    val numberOfCrew = readln().toInt()

    println("Количество ящиков с провизией на борту (число):")
    val numberOfProvisions = readln().toInt()

    println("Благоприятность метеоусловий (true/false):")
    val isGoodWeather = readln().toBoolean()

    val swimming = ((isDamage != IS_DAMAGE)
            && (numberOfCrew in MIN_CREW..MAX_CREW)
            && (numberOfProvisions > PROVISIONS))
            || ((numberOfCrew == MAX_CREW)
            && (isGoodWeather == IS_GOOD_WEATHER)
            && (numberOfProvisions >= PROVISIONS))

    println("Разрешение на плавание: $swimming")
}