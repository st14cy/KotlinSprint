package org.example.lesson_1

const val MINUTES_IN_HOUR = 60

fun main() {
    val seconds: Short = 6480
    val totalHours = seconds / MINUTES_IN_HOUR / MINUTES_IN_HOUR
    val totalMinutes = seconds / MINUTES_IN_HOUR % MINUTES_IN_HOUR
    val totalSecond = seconds % MINUTES_IN_HOUR

    println(String.format("%02d:%02d:%02d", totalHours, totalMinutes, totalSecond))
}