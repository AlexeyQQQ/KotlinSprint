package lesson_21

import java.io.File

fun main() {
    val file = File("src/main/kotlin/lesson_21/file_task21.txt")
    file.createNewFile()

    file.addText("First")
    file.addText("Second")
    file.addText("Third")
    file.addText("Первый")
    file.addText("Второй")
    file.addText("Третий")
}

fun File.addText(string: String) {
    val fileContent = "${string.lowercase()}\n" + this.readText()
    this.writeText(fileContent)
}