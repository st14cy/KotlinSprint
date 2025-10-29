package org.example.lesson_2

fun main() {
    var sum = 70_000.0
    val interestRate = 16.7

    var i = 0
    while (i < 20) {
        sum += (sum * interestRate / 100)
        i++;
    }

    println("%.3f".format(sum))
}


