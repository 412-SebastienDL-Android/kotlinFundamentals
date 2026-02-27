package CPOOO

open class Animal(val nombre: String, val edad: Int) {
    open fun hacerSonido() {
        println("Sonido genérico.")
    }
    fun describirse() {
        println("Soy $nombre y tengo $edad años.")
    }
}
class Perro(nombre: String, edad: Int) : Animal(nombre, edad) {
    override fun hacerSonido() {
        println("Guau")
    }
}
class Gato(nombre: String, edad: Int) : Animal(nombre, edad) {
    override fun hacerSonido() {
        println("Miau")
    }
}

class Vaca(nombre: String, edad: Int) : Animal(nombre, edad) {
    override fun hacerSonido() {
        println("Muh")
    }
}

fun main() {
    val perro = Perro("Rex", 3)
    val gato = Gato(nombre = "Michi", edad = 4)
    val vaca = Vaca(nombre = "lola", edad = 7)
    perro.describirse()
    perro.hacerSonido()
    gato.describirse()
    gato.hacerSonido()
    vaca.describirse()
    vaca.hacerSonido()
// TODO: Crea y usa Gato y Vaca
}