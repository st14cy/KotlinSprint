package org.example.lesson_5

fun main() {
    val firstNum = 36
    val secondNum = 2

    println("Введите первое число: ")
    val num1 = readln().trim().toInt()
    println("Введите второе число: ")
    val num2 = readln().trim().toInt()
    if (num1 !in 0..42 || num2 !in 0..42) {
        println("Число должно быть в диапазоне от 0 до 42")
        return;
    }

    var matches = 0;

    if (num1 == firstNum || num2 == firstNum) matches++
    if (num1 == secondNum || num2 == secondNum) matches++

    var res = when (matches) {
        1 -> "Вы выиграли утешительный приз!"
        2 -> "Поздравляем! Вы выиграли главный приз!"
        else -> "Неудача!"
    }

    println(res)
}