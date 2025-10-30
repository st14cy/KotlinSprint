package org.example.lesson_4

const val COUNT_FREE_TABLE = 13

fun main() {
    val todayReservedTables = 13
    val tomorrowReservedTables = 9
    println(
        "[Доступность столиков на сегодня: ${COUNT_FREE_TABLE > todayReservedTables}],"
                + "\n[Доступность столиков на завтра: ${COUNT_FREE_TABLE > tomorrowReservedTables}]."
    )
}