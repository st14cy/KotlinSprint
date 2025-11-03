package org.example.lesson_5

fun main() {
    val firstNum = 5
    val secondNum = 7
    val correctSum = firstNum + secondNum
    println("Введите сумму чисел $firstNum+$secondNum")
    val userSum = readln().toInt()
    val result = if (userSum == correctSum) {
        "Добро пожаловать!"
    } else {
        "Доступ запрещен."
    }

    println(result)
}