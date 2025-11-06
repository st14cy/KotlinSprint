package org.example.lesson_5

import kotlin.random.Random

const val MIN_NUM=0
const val MAX_NUM=42
const val COUNT_CORRECT_NUM=3

fun main() {
    val lotteryNumbers = mutableListOf<Int>();
    val personsNumbers = mutableListOf<Int>();
    while (lotteryNumbers.size < COUNT_CORRECT_NUM) {
        val num = Random.nextInt(MIN_NUM, MAX_NUM+1)
        if (num !in lotteryNumbers) {
            lotteryNumbers.add(num)
        }
    }

    var countNum = 1
    while (personsNumbers.size < COUNT_CORRECT_NUM) {
        println("Введите ${countNum}e число: ");
        var num = readln().trim().toInt()
        if (num !in MIN_NUM..MAX_NUM) {
            println("Число должно быть в промежутке от $MIN_NUM до $MAX_NUM");
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
