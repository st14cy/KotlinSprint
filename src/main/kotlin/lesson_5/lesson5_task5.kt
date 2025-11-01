package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val lotteryNumbers = mutableListOf<Int>();
    val personsNumbers = mutableListOf<Int>();
    while (lotteryNumbers.size < 3) {
        val num = Random.nextInt(0, 43)
        if (num !in lotteryNumbers) {
            lotteryNumbers.add(num)
        }
    }

    var countNum = 1
    while (personsNumbers.size < 3) {
        println("Введите ${countNum}e число: ");
        var num = readln().trim().toInt()
        if (num !in 0..42) {
            println("Число должно быть в промежутке от 0 до 42");
            return
        }
        countNum++
        personsNumbers.add(num)
    }

    val matches = personsNumbers.intersect(lotteryNumbers)
    val message = when (matches.size) {
        1 -> "Вы угадали одно число и выиграли утешительный приз"
        2 -> "Вы угадали два числа и выиграли крупный приз"
        3 -> "Вы угадали все числа и выиграли джекпот"
        else -> "Вы не угадали ни одного числа"
    }
    println(message)

    println("Вы угадали: ${matches.joinToString(", ")}")
}
