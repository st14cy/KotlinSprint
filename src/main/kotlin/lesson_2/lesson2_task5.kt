package org.example.lesson_2

fun main() {
    val second: Short = 6480
    val totalHours = second / 60 / 60
    val totalMinutes = second/ 60 % 60
    val totalSecond=second % 60

    println(String.format("%02d:%02d:%02d", totalHours, totalMinutes, totalSecond))
}