package org.example.lesson_2

const val PROCENT = 100

fun main() {
    val crystal = 7
    val iron = 11
    val buffProcent = 20

    val crystalBuff = crystal * buffProcent / PROCENT
    val ironBuff = iron * buffProcent / PROCENT

    println("Кристаллическая руда: $crystalBuff")
    println("Железная руда: $ironBuff")
}