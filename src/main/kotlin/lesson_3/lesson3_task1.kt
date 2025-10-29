package org.example.lesson_3

fun main() {
    var name = "Илон Маск"
    var welcomeTextDay = "Добрый день"
    var welcomeTextEvening = "Добрый вечер"

    var welcomText = "$welcomeTextDay, $name!"
    welcomeTextDay = "$welcomeTextEvening, $name!"

    println(welcomText)
    println(welcomeTextDay)
}
