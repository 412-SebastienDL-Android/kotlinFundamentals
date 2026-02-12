package com.example.lib

fun main () {
    /*
    Dada una lista de numero desordenados, encuentra e imprime cual es el
    numero mas grande SIN usar la duncion MAX
    * */
    val numbers = listOf<Int>(1,5,4,3,2,6,7,8,9,10,23,23,12)
    var maxNumber = numbers[0]
    for (number in numbers){
        if(number > maxNumber){
            maxNumber = number
        }
    }
    println("El numero mas grande es $maxNumber")



}