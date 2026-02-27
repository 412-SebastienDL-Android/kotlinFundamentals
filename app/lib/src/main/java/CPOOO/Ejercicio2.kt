package CPOOO

class CuentaBancaria(val titular: String) {
    var saldo: Double = 0.0
    fun depositar(cantidad: Double) {
        saldo += cantidad
        println("Nuevo saldo: $saldo")
    }
    fun retirar(cantidad: Double) {
        if (saldo >= cantidad) {
            saldo -= cantidad
            println("Retiro realizado. Nuevo saldo: $saldo")
        } else {
            println("Error no hay suficiente saldo.")
        }
    }
    fun mostrarSaldo() {
        println("Saldo actual de $titular: $saldo")
    }
}
fun main() {
    val cuenta = CuentaBancaria("Maria Garcia")
    cuenta.depositar(1000.0)
    cuenta.retirar(400.0)
    cuenta.retirar(800.0) // No debe permitirlo
    cuenta.mostrarSaldo()
}