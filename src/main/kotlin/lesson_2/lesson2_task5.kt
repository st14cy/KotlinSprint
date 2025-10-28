package org.example.lesson_2

fun main() {
    val seconds: Short = 6480
    val totalHours = seconds / 60 / 60
    val totalMinutes = seconds / 60 % 60
    val totalSecond = seconds % 60

    println(String.format("%02d:%02d:%02d", totalHours, totalMinutes, totalSecond))
}