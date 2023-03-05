package ru.netology
fun main() {
    var likes = 21
    val person = " человеку"
    val people = " людям"
    var shownMessage = "Понравилось " + likes
    shownMessage += if (likes == 11) {
        people
    }else if(likes == 1 || (likes - 1) % 10 == 0 )  {
        person
    } else {
        people
    }
    println(shownMessage)
}