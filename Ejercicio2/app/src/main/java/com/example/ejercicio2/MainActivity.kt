package com.example.ejercicio2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
   //12. en la clase main. crearemos 3 objetos donde marcaremos la competencia de
   //los distintos negocios.
    fun main() {
        val negocio1 = Bodega()
        val negocio2 = Bodega()
        val negocio3 = Bodega()

       //stock de cada negocio
       negocio1.agregarProducto(Producto("Producto1", 10.0, 50))
       negocio2.agregarProducto(Producto("Producto1", 10.0, 50))
       negocio3.agregarProducto(Producto("Producto1", 8.0, 50))

       //● dia 1) al negocio 2 le compran 15 productos
    negocio2.venderProducto(negocio2, "Producto1", 15)

    // ● día 2. al negocio 3 le viene un camión con 10 productos nuevos para agregar
       //al depósito.
    negocio3.agregarProducto(Producto("Producto2", 6.0, 30))

       //● dia 3 ) el negocio 1 vende 5 productos
    negocio1.venderProducto(negocio1, "Producto1", 5)

       //● dia 4 ) el negocio 1 recibe una devolución de un producto
    // Simulación de devolución
    negocio1.agregarProducto(Producto("Producto2", 5.0, 1))

       //● dia 5 ) el negocio 2 vende 10 productos
    negocio2.venderProducto(negocio2, "Producto2", 10)

//● dia 6 ) el negocio 3 vende 10 productos
    negocio3.venderProducto(negocio3, "Producto2", 10)

//● dia 7 ) el negocio 2 recibe un camión con 10 productos existentes
    negocio2.agregarProducto(Producto("Producto3", 10.0, 10))

       //● dia 8) el negocio 1 le compra al negocio 3 5 productos
//● dia 9) el negocio 2 le compra 7 productos al negocio 1 y si no tiene stock se
//los compra al negocio 3
//● dia 10) todos los negocios venden 5 productos iguales. y mismas cantidades.
//Imprimir por pantalla el stock real de cada producto. y la cantidad de plata
//recaudada final.
//tener en cuenta que la venta se carga como positivo. y los camiones con
//mercadería descuentan.
//Crear las funciones necesarias para hacer que esto funcione como el control
//de ventas.
    // Imprimir estado final de la bodega
    println("Estado final de la bodega 1:")
    negocio1.listaProductos.forEach { println("${it.nombre}: ${it.stock}: ${it.precio}") }

    println("Estado final de la bodega 2:")
    negocio2.listaProductos.forEach { println("${it.nombre}: ${it.stock}: ${it.precio}") }

    println("Estado final de la bodega 3:")
    negocio3.listaProductos.forEach { println("${it.nombre}: ${it.stock}: ${it.precio}") }
}
}