package com.example.ejercicio1kotlin

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
    fun main() {
        //  5. Crear 7 frutas.
        val manzana = Fruit("Manzana", 3.5)
        val naranja = Fruit("Naranja", 4.0)
        val banana = Fruit("Plátano", 2.5)
        val pera = Fruit("Pera", 3.0)
        val uva = Fruit("Uva", 5.5)
        val mango = Fruit("Mango", 6.0)
        val frutilla = Fruit("Frutilla", 7.0)

        // 6. asignarles un stock diferente a cada una.
        manzana.cargarStock(40)
        naranja.cargarStock(20)
        banana.cargarStock(30)
        pera.cargarStock(10)
        uva.cargarStock(15)
        mango.cargarStock(5)
        frutilla.cargarStock(25)

        //7. generar ventas en algunas.
        manzana.vender(20)
        naranja.vender(20)
        banana.vender(15)
        pera.vender(10)
        uva.vender(12)
        mango.vender(5)
        frutilla.vender(15)

        // 8. imprimir un stock final de las frutas disponibles que quedaron
        println("Stock final de las frutas disponibles:")
        manzana.printInfo()
        naranja.printInfo()
        banana.printInfo()
        pera.printInfo()
        uva.printInfo()
        mango.printInfo()
        frutilla.printInfo()
    }
}



