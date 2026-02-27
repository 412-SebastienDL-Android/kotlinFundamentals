package CPOOO

class person(val name: String, val age: Int,val ciudad: String){
    fun sayHello(){
        println("Hola me llamo $name y mi edad es $age")
    }
    fun MayorEdada(): Boolean{
        if (age >= 18){
            return true
        }else{
            return false
        }
    }
}

fun main (){
    val person1 = person(name = "Sebastien", age = 20, ciudad = "Irapuato")
    val person2 = person(name = "Victor", age = 17, ciudad = "Leon")
    println(person1.sayHello())
    println(person1.name+" es mayor de edad:"+person1.MayorEdada())
    println(person2.sayHello())
    println(person2.name+" es mayor de edad:"+person2.MayorEdada())
}