package org.example.lesson_2

import kotlin.math.pow

const val PROCENT = 100

fun main() {
    var sum = 70_000.0
    val interestRate = 16.7
    var year = 20
    var finalValue = sum * (1 + interestRate / PROCENT).pow(year)

    println("%.3f".format(finalValue))
}