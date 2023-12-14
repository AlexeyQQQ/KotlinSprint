package lesson_17

fun main() {
    val folder = Folder("Test", 10, true)
    println("${folder.name}, ${folder.numberOfFiles}")

    folder.isSecret = false
    println("${folder.name}, ${folder.numberOfFiles}")
}


class Folder(
    _name: String,
    _numberOfFiles: Int,
    _isSecret: Boolean,
) {
    val name = _name
        get() = if (isSecret) "Скрытая папка" else field

    val numberOfFiles = _numberOfFiles
        get() = if (isSecret) 0 else field

    var isSecret = _isSecret
}