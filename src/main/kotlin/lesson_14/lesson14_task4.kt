package lesson_14

fun main() {
    val planet = Planet(
        "Mars",
        true,
        true,
        listOf(
            Satellite("Phobos", false, true),
            Satellite("Deimos", false, true)
        )
    )

    planet.printNames()
}


abstract class CelestialBody(
    val name: String,
    val isWithAtmosphere: Boolean,
    val isSuitableForLanding: Boolean,
) {
    abstract fun printNames()
}


class Satellite(
    name: String,
    isWithAtmosphere: Boolean,
    isSuitableForLanding: Boolean,
) : CelestialBody(name, isWithAtmosphere, isSuitableForLanding) {

    override fun printNames() {
        println("Название спутника: $name")
    }
}


class Planet(
    name: String,
    isWithAtmosphere: Boolean,
    isSuitableForLanding: Boolean,
    val listOfSatellite: List<Satellite>,
) : CelestialBody(name, isWithAtmosphere, isSuitableForLanding) {

    override fun printNames() {
        println("Название планеты: $name")
        for (i in listOfSatellite) {
            i.printNames()
        }
    }
}