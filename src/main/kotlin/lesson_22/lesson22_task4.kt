package lesson_22

import lesson_22.State.*

fun main() {
    val mainScreenViewModel = MainScreenViewModel()
    println(mainScreenViewModel.mainScreenState)

    repeat(5) {
        mainScreenViewModel.loadData()
        println(mainScreenViewModel.mainScreenState)
        Thread.sleep(1000)
    }
}


class MainScreenViewModel {
    var mainScreenState = MainScreenState()

    fun loadData() {
        val state = listOf(NO_DATA, UPLOADING, NEW_DATA).random()
        mainScreenState = when (state) {
            NO_DATA -> mainScreenState.copy()
            UPLOADING -> mainScreenState.copy(isLoading = true)
            NEW_DATA -> mainScreenState.copy(data = "Новые данные", isLoading = false)
        }
    }
}


data class MainScreenState(
    val data: String? = null,
    val isLoading: Boolean = false,
)


enum class State {
    NO_DATA,
    UPLOADING,
    NEW_DATA,
}
