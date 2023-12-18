package lesson_21

fun main() {
    val mapOfSkills = mapOf(
        Pair("Сила", 50),
        Pair("Ловкость", 70),
        Pair("Телосложение", 20),
        Pair("Мудрость", 70),
        Pair("Удача", 40),
        Pair("Харизма", 30),
    )

    println(mapOfSkills.maxCategory())
}

fun Map<String, Int>.maxCategory(): String {
    val max = this.toList().sortedByDescending { (_, value: Int) -> value }
    return max[0].first
}