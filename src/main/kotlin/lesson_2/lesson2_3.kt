package org.example.lesson_2

fun main() {
    val hourDeparture = 9
    val minutesDeparture = 39
    val minutesOnTheWay = 457
    val oneHours = 60

    val totalMinutesOnTheWay = hourDeparture * oneHours + minutesDeparture + minutesOnTheWay
    val totalHour = totalMinutesOnTheWay / oneHours
    val totalMinutes = totalMinutesOnTheWay % oneHours

    println("%02d:%02d".format(totalHour, totalMinutes))
}


