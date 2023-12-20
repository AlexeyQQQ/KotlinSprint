package lesson_22

import java.util.Date

fun main() {
    val alphaCentauri = GalacticGuide(
        "Альфа Центавра",
        "Тройная звёздная система в созвездии Центавра",
        Date(System.currentTimeMillis()),
        4.22,
    )

    println(
        """
        Название: ${alphaCentauri.component1()}
        Описание: ${alphaCentauri.component2()}
        Дата и время: ${alphaCentauri.component3()}
        Расстояние в световых годах: ${alphaCentauri.component4()}
    """.trimIndent()
    )
}


data class GalacticGuide(
    val name: String,
    val description: String,
    val date: Date,
    val distance: Double,
)