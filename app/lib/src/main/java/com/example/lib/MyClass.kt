package com.example.lib

fun main () {
    val name : String = "Juan"
    var age : Int = 28
    age = 29

    val cost = 500
    val percentage = 0.15
    val tip = cost * percentage
    val total = cost + tip
    println("El total es $$total")
    println("La propina es $$tip")

}