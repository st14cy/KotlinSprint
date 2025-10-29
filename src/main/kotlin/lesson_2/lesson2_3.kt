package org.example.lesson_2

fun main() {
    val hourDeparture = 9
    val minutesDeparture = 39
    val minutesOnTheWay = 457
    val totalMinutesOnTheWay = hourDeparture * 60 + minutesDeparture + minutesOnTheWay
    val totalHour = totalMinutesOnTheWay / 60
    val totalMinutes = totalMinutesOnTheWay % 60
    println("%02d:%02d".format(totalHour, totalMinutes))
}




