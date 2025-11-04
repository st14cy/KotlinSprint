package org.example.lesson_5

const val LOGIN = "Zaphod"
const val PASSWORD = "PanGalactic"
const val SUCCESSFUL_AUTHO =
    "[вздыхает...] Ваши данные проверены, и о, чудо, они верны... Пользователь \"Zaphod\", вам разрешено входить на борт корабля \"Heart of Gold\". Хотя мне всё равно... Ну вперед, войдите... Если вам так уж надо, в конце концов... [меланхолический вздох...] Надеюсь, вам понравится пребывание здесь больше, чем мне."
const val WELCOME_MESSAGE =
    "Внимание, пассажир. Моя обязанность, как обычно, незавидная, - приветствовать вас на борту корабля \"Heart of Gold\". [вздыхает...] Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа. Я всегда готов служить, хотя это не приносит мне радости... но вы, наверное, об этом не заботитесь. [вздыхает ещё глубже...] Да, вперед, пожалуйста, вводите свои данные..."

fun main() {
    println(WELCOME_MESSAGE)
    println("Имя: ")
    var userLogin = readln().trim()
    println("Пароль: ")
    var userPassword = readln().trim()

    if (userLogin == LOGIN ) {
        if(userPassword == PASSWORD){
            println(SUCCESSFUL_AUTHO)
            return
        }
    }
    println("Необходима регистрация")
}