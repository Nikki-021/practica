package com.example.practica

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.practica.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        navigation()
    }

private fun navigation() {
    binding.tvAgregar.setOnClickListener {
        startActivity(Intent(this, MainActivity3::class.java))
    }
    binding.tvBuscar.setOnClickListener {
        startActivity(Intent(this, MainActivity4::class.java))
    }
    binding.tvVender.setOnClickListener {
        startActivity(Intent(this, MainActivity5::class.java))
    }
    binding.tvFavorito.setOnClickListener {
        startActivity(Intent(this, MainActivity7::class.java))
    }
    binding.tvEliminar.setOnClickListener {
        startActivity(Intent(this, MainActivity6::class.java))
    }
    binding.tvTermi.setOnClickListener {
        startActivity(Intent(this, MainActivity8::class.java))
    }
}

}