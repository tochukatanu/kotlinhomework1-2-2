package ru.netology

fun main() {
    var likes = 1111
    val person = " человеку"
    val people = " людям"
    var shownMessage = "Понравилось " + likes
    shownMessage += if (likes == 11 || (likes - 11) % 10 == 0) {
        people
    } else if (likes == 1 || (likes - 1) % 10 == 0) {
        person
    } else {
        people
    }
    println(shownMessage)
}