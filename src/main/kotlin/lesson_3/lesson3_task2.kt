package org.example.lesson_3

fun main() {
    val employeeCount = 50
    val employeeSalary = 30000
    val internCount = 30
    val internSalary = 20000

    val totalEmployeeExpense = employeeCount * employeeSalary
    val totalSalaryExpense = totalEmployeeExpense + (internCount * internSalary)
    val avgSalary = totalSalaryExpense / (employeeCount + internCount)

    println(totalEmployeeExpense)
    println(totalSalaryExpense)
    println(avgSalary)
}