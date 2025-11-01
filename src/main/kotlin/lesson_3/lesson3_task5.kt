package org.example.lesson_3

fun main(){
    var stroke="D2-D4;0";

    var from = stroke.substringBefore("-")
    var to= stroke.substringAfter("-").substringBefore(";")
    var strokeNumber=stroke.substringAfter(";")

    println("Из $from")
    println("В $to")
    println("Номер хода $strokeNumber")
}