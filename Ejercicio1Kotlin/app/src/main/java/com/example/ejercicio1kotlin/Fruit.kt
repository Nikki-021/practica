package com.example.ejercicio1kotlin

// 1. Crear una clase llamada Fruit. con un constructor que pida Precio y nombre.
//2. Asignarle propiedades como estación, precio_oferta, stock, y mas
class Fruit(val nombre: String, val precio: Double) {
    var estacion: String = ""
    var precio_oferta: Double = 0.0
    var stock: Int = 0

    // 3. crear funciones. cómo cargarStock. ( esta tiene que sumar una cantidad X al
    //Stock del objeto.
    fun cargarStock(cantidad: Int) {
        cantidad + stock
    }

    // 4. crear una función que sea vender ( esta tiene que restar Stock y no pasar a
    //negativo nunca )
    fun vender(cantidad: Int): Int {
        val disCant = if (cantidad > stock ) {0} else {
        stock - cantidad }
        return disCant
    }

    // Función para imprimir información de la fruta
    fun printInfo() {
        println("Nombre: $nombre")
        println("Precio: $precio")
        println("Estación: $estacion")
        println("Precio de oferta: $precio_oferta")
        println("Stock disponible: $stock")
        println()
    }
}

