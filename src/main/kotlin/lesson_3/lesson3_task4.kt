package org.example.lesson_3

fun main() {
    var from = "E2"
    var to = "E4"
    var strokeNumber = 1
    println("Из $from в $to, номер хода: $strokeNumber")

    from = "D2"
    to = "D3"
    println("Из $from в $to, номер хода: ${++strokeNumber}")
}