package org.example.lesson_4

const val MIN_PERSONS=55
const val MAX_PERSONS=70
const val PROVISION_BOX=50

fun main() {
    println("Наличие повреждений корпуса(true/false)")
    var isDamage = readln().toBoolean()
    println("Tекущий состав экипажа")
    var countPerson = readln().toIntOrNull() ?: 0
    println("Наличество ящиков с провизией на борту")
    var countProvisionBox = readln().toIntOrNull() ?: 0
    println("Благоприятность метеоусловий(true/false)")
    var weather = readln().toBoolean()

    println("${(!isDamage && countPerson in MIN_PERSONS..MAX_PERSONS && countProvisionBox > PROVISION_BOX) || (isDamage && countPerson == MAX_PERSONS && weather && countProvisionBox >= PROVISION_BOX)}")

}