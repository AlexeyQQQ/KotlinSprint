package lesson_21

import java.io.File
import java.io.RandomAccessFile

fun main() {
    val file = File("src/main/kotlin/lesson_21/file_task21.txt")
    file.createNewFile()

    file.addText("First")
    file.addText("Second")
    file.addText("Third")
}

fun File.addText( string: String) {
    val fileContent = this.readBytes()
    val randomAccessFile = RandomAccessFile(this, "rw")
    randomAccessFile.seek(0)
    randomAccessFile.writeBytes("${string.lowercase()}\n")
    randomAccessFile.write(fileContent)
    randomAccessFile.close()
}