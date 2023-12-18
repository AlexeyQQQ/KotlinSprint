package lesson_21

fun main() {
    val string = "hello"
    println(string.vowelCount())
}

fun String.vowelCount(): Int {
    val listOfVowels = listOf('a', 'e', 'i', 'o', 'u', 'y')
    var counter = 0
    for (i in 0 until this.length) {
        if (listOfVowels.contains(this[i].lowercaseChar())) counter++
    }
    return counter
}