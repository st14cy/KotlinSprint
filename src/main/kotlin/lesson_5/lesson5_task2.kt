package org.example.lesson_5

import java.time.LocalDate

const val AGE_OF_MAJORITY= 18

fun main(){
    println("Введите год рождения: ")
    var yearBorn : Int= readln().toInt()
    val currentYear = LocalDate.now().year
    var yearOld=currentYear-yearBorn

    if(yearOld>AGE_OF_MAJORITY){
        println("Показать экран со скрытым контентом")
    }
}