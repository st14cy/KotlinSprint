package org.example.lesson_5

import kotlin.math.pow

fun main() {
    println("Напишите свой вес в кг: ")
    val weight: Double = readln().trim().toDouble()
    println("Напишите свой рост в см: ")
    var height: Double = readln().trim().toDouble()
    height /= 100
    val imt: Double = weight / (height.pow(2))
    val message = when {
        imt < 18.5 -> "Недостаточная масса тела"
        imt in 18.5..<25.0 -> "Нормальная масса тела"
        imt in 25.0..<30.0 -> "Избыточная масса тела"
        else -> "Ожирение"
    }
    val formatted = "%.2f".format(imt)
    println("ИМТ: $formatted\n Категория: $message")
}