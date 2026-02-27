package com.example.lib

class person(val name: String,val age: Int){
    fun sayHello(language: String){
        if (language == "Spanish") {
            println("Hola soy $name y tengo $age años")
        }else{
            println("Hello")
        }
    }
    fun Caminar() : Double{
        return 10.0
    }
}

abstract class Shape{
    abstract fun calculateArea() : Double
}
class square(val side: Double) : Shape(){
    override fun calculateArea(): Double {
        return side*side
    }

}
class circle(private val radius : Double): Shape(){
    override fun calculateArea(): Double {
        return Math.PI *radius*radius
    }

}


fun main(){
    val Person = person(name = "Sebastien Davalos", age = 20)
    val person2 = person(age = 20, name = "Davalos")


    val Square = square(side = 10.0)
    val Circle = circle(radius = 10.0)

    val shapes = listOf(Square, Circle)
    for(shape in shapes){
        println(shape.calculateArea())
    }
}