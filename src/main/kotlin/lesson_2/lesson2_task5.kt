package org.example.lesson_2

import kotlin.math.pow

const val PROCENT = 100

fun main() {
    val sum = 70_000.0
    val interestRate = 16.7
    val year = 20
    val finalValue = sum * (1 + interestRate / PROCENT).pow(year)

    println("%.3f".format(finalValue))
}