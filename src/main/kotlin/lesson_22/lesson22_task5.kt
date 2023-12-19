package lesson_22

import java.util.Date

fun main() {
    val alphaCentauri = GalacticGuide(
        "Альфа Центавра",
        "Тройная звёздная система в созвездии Центавра",
        Date(System.currentTimeMillis()),
        4.22,
    )

    val (name, description, date, distance) = alphaCentauri
    println(
        """
        Название: $name
        Описание: $description
        Дата и время: $date
        Расстояние в световых годах: $distance
    """.trimIndent()
    )
}


data class GalacticGuide(
    val name: String,
    val description: String,
    val date: Date,
    val distance: Double,
)