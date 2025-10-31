package org.example.lesson_2

const val MINUTES_IN_HOUR = 60

fun main() {
    val hourDeparture = 9
    val minutesDeparture = 39
    val minutesOnTheWay = 457
    val totalMinutesOnTheWay = hourDeparture * MINUTES_IN_HOUR + minutesDeparture + minutesOnTheWay
    val totalHour = totalMinutesOnTheWay / MINUTES_IN_HOUR
    val totalMinutes = totalMinutesOnTheWay % MINUTES_IN_HOUR

    println("%02d:%02d".format(totalHour, totalMinutes))
}