package lesson_4

const val MIN_AVERAGE_WEIGHT = 35
const val MAX_AVERAGE_WEIGHT = 100
const val AVERAGE_VOLUME = 100

fun main() {
    val objectWeight1 = 20
    val objectVolume1 = 80

    println(
        "Груз с весом $objectWeight1 кг и объемом $objectVolume1 л соответствует категории 'Average': ${
            objectWeight1 >= MIN_AVERAGE_WEIGHT
                    && objectWeight1 <= MAX_AVERAGE_WEIGHT
                    && objectVolume1 < AVERAGE_VOLUME
        }"
    )

    val objectWeight2 = 50
    val objectVolume2 = 100

    println(
        "Груз с весом $objectWeight2 кг и объемом $objectVolume2 л соответствует категории 'Average': ${
            objectWeight2 >= MIN_AVERAGE_WEIGHT
                    && objectWeight2 <= MAX_AVERAGE_WEIGHT
                    && objectVolume2 < AVERAGE_VOLUME
        }"
    )
}