package lesson_15

fun main() {
    val passengerCar1 = PassengerCar()
    val passengerCar2 = PassengerCar()
    val truck = Truck()

    repeat(3) {
        passengerCar1.loadPassengers()
        passengerCar2.loadPassengers()
        truck.loadCargo()
    }

    println()
    println(
        """
        Всего перевезли:
        ${passengerCar1.passengers + passengerCar2.passengers + truck.passengers} пассажиров
        ${passengerCar1.cargo + passengerCar2.cargo + truck.cargo} тонн груза
    """.trimIndent()
    )
}


abstract class Car {
    abstract var passengers: Int
    abstract var cargo: Int
}


interface Rides {
    fun ride()
}


interface CarriesPassengers {
    fun loadPassengers()
    fun unloadPassengers()
}


interface CarriesCargo {
    fun loadCargo()
    fun unloadCargo()
}


class PassengerCar : Car(), Rides, CarriesPassengers {

    override var passengers: Int = 0
        set(value) {
            field = if (value > MAX_PASSENGERS) {
                println("Максимальная вместимость $MAX_PASSENGERS, остальные идут пешком!")
                MAX_PASSENGERS
            } else if (value < MIN_COUNT) {
                println("Минимальная вместимость $MIN_COUNT!")
                MIN_COUNT
            } else {
                value
            }
        }

    override var cargo: Int = 0
        set(value) {
            field = if (value > MAX_CARGO) {
                println("Максимальная вместимость грузов $MAX_CARGO тонн, остальное выбрасываем!")
                MAX_CARGO
            } else if (value < MIN_COUNT) {
                println("Минимальная вместимость $MIN_COUNT!")
                MIN_COUNT
            } else {
                value
            }
        }

    override fun ride() {
        println("Легковая машина едет")
    }

    override fun loadPassengers() {
        println("Легковая машина принимает пассажира. Человек в машине: ${++passengers}.")
    }

    override fun unloadPassengers() {
        println("Легковая машина высаживает пассажира. Человек в машине: ${--passengers}.")
    }

    companion object {
        private const val MAX_PASSENGERS = 3
        private const val MAX_CARGO = 0
        private const val MIN_COUNT = 0
    }
}


class Truck : Car(), Rides, CarriesPassengers, CarriesCargo {

    override var passengers: Int = 0
        set(value) {
            field = if (value > MAX_PASSENGERS) {
                println("Максимальная вместимость $MAX_PASSENGERS, остальные идут пешком!")
                MAX_PASSENGERS
            } else if (value < MIN_COUNT) {
                println("Минимальная вместимость $MIN_COUNT!")
                MIN_COUNT
            } else {
                value
            }
        }

    override var cargo: Int = 0
        set(value) {
            field = if (value > MAX_CARGO) {
                println("Максимальная вместимость грузов $MAX_CARGO тонн, остальное выбрасываем!")
                MAX_CARGO
            } else if (value < MIN_COUNT) {
                println("Минимальная вместимость $MIN_COUNT!")
                MIN_COUNT
            } else {
                value
            }
        }

    override fun ride() {
        println("Грузовая машина едет")
    }

    override fun loadPassengers() {
        println("Грузовая машина принимает пассажира. Человек в машине: ${++passengers}.")
    }

    override fun unloadPassengers() {
        println("Грузовая машина высаживает пассажира. Человек в машине: ${--passengers}.")
    }

    override fun loadCargo() {
        println("Грузовая машина принимает груз. Тонн в машине: ${++cargo}.")
    }

    override fun unloadCargo() {
        println("Грузовая машина высаживает груз. Тонн в машине: ${--cargo}.")
    }

    companion object {
        private const val MAX_PASSENGERS = 1
        private const val MAX_CARGO = 2
        private const val MIN_COUNT = 0
    }
}