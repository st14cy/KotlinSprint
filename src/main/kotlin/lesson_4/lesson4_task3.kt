package org.example.lesson_4

const val SUNNY_WEATHER = true
const val TENT_STATE = true
const val HUMIDITY = 20
const val SEASON = "зима"

fun main() {
    val isSunny = true
    val isTentOpen = true
    val humidity = 20
    val currentSeason = "зима"

    val result= isSunny==SUNNY_WEATHER
            && isTentOpen==TENT_STATE &&
            humidity == HUMIDITY &&
            currentSeason == SEASON
    println("Благоприятные ли условия сейчас для роста бобовых? $result")
}

