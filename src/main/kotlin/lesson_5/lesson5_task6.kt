package org.example.lesson_5

import kotlin.math.pow

const val FIRST_WEIGHT = 18.5
const val SECOND_WEIGHT = 25.0
const val THIRD_WEIGHT = 30.0

fun main() {
    println("Напишите свой вес в кг: ")
    val weight: Double = readln().trim().toDouble()
    println("Напишите свой рост в см: ")
    var height: Double = readln().trim().toDouble()
    height /= 100
    val imt: Double = weight / (height.pow(2))
    val message = when {
        imt < FIRST_WEIGHT -> "Недостаточная масса тела"
        imt in FIRST_WEIGHT..<SECOND_WEIGHT -> "Нормальная масса тела"
        imt in SECOND_WEIGHT..<THIRD_WEIGHT -> "Избыточная масса тела"
        else -> "Ожирение"
    }
    val formatted = "%.2f".format(imt)
    println("ИМТ: $formatted\n Категория: $message")
}