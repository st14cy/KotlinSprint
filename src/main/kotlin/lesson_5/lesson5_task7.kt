package org.example.lesson_5

fun main() {
    println("Расстояние поездки (в километрах)")
    val distance = readln().trim().toDouble()
    println("Расход топлива на 100 км (в литрах)")
    val expenditure = readln().trim().toDouble()
    println("Текущая цена за литр топлива.")
    val price = readln().trim().toDouble()
    val totalFuel = (distance * expenditure) / 100
    val totalPrice = totalFuel * price
    val formattedPrice = "%.2f".format(totalPrice)

    println("Общее кол-во топлива $totalFuel\nИтоговая стоимость поездки $formattedPrice р.")
}