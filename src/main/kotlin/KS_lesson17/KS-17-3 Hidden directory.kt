package org.kotlin.sprint.KS_lesson17

class Directory(name: String, numberOfFiles: Int, var isPrivate: Boolean) {

    var name: String = name
        get() = if (isPrivate) "Скрытая папка" else field

    var numberOfFiles: Int = numberOfFiles
        get() = if (isPrivate) 0 else field
}

fun main() {

    val directory1 = Directory(name = "Мои фотографии", numberOfFiles = 15, isPrivate = false)
    val directory2 = Directory(name = "Видео с корпоратива", numberOfFiles = 31, isPrivate = true)

    println(directory1.name)
    println(directory1.numberOfFiles)
    println(directory2.name)
    println(directory2.numberOfFiles)

}
