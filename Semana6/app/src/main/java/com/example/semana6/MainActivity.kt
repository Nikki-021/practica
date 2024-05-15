package com.example.semana6

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
        //con constructor
        var miLibro = Libro("Un mounstro viene a verme","Patrick Nes")

        ////sin constructor
        var persona = Persona()
        persona.nombre
        persona.edad

        //constructor por default
        var miMascota = Mascota()

        //propiedades mutables
        var alumno = Estudiante()
        alumno.calificacion = 90

        //Solo lectura
        var configuracion = Configuracion ()
        println(configuracion.urlServer)
    }



}