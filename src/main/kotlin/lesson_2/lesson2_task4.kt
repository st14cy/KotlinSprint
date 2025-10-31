package org.example.lesson_2

const val PERCENT = 100

fun main() {
    val crystal = 7
    val iron = 11
    val buffPercent = 20

    val crystalBuff = crystal * buffPercent / PERCENT.toDouble()
    val ironBuff = iron * buffPercent / PERCENT.toDouble()

    println("Кристаллическая руда: $crystalBuff")
    println("Железная руда: $ironBuff")
}