package lesson_21

import java.io.File
import java.io.RandomAccessFile

fun main() {
    val file = File("src/main/kotlin/lesson_21/file_task21.txt")
    file.createNewFile()

    file.addText(file, "First")
    file.addText(file, "Second")
    file.addText(file, "Third")
}

fun File.addText(file: File, string: String) {
    val fileContent = file.readBytes()
    val randomAccessFile = RandomAccessFile(file, "rw")
    randomAccessFile.seek(0)
    randomAccessFile.writeBytes("${string.lowercase()}\n")
    randomAccessFile.write(fileContent)
    randomAccessFile.close()
}