package org.example.lesson_3

fun main() {
    var name = "Илон Маск"
    val welcomeTextDay = "Добрый день"
    val welcomeTextEvening = "Добрый вечер"

    var welcomText = "$welcomeTextDay, $name!"
    println(welcomText)

    welcomText = "$welcomeTextEvening, $name!"
    println(welcomText)
}
