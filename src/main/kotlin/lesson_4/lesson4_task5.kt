package org.example.lesson_4

fun main() {
    println("Наличие повреждений корпуса(true/false)")
    var isDamage = readln().toBoolean()
    println("Tекущий состав экипажа")
    var countPerson = readln().toIntOrNull() ?: 0
    println("Наличество ящиков с провизией на борту")
    var countProvisionBox = readln().toIntOrNull() ?: 0
    println("Благоприятность метеоусловий(true/false)")
    var wether = readln().toBoolean()

    println("${(!isDamage && countPerson in 55..70 && countProvisionBox > 50) || (isDamage && countPerson == 70 && wether && countProvisionBox >= 50)}")

}