package com.example.task7_layouts_try1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val estado_Civil_Spinner = findViewById<Spinner>(R.id.spinner1)
        val estado_Civil_Lista = listOf("Soltero", "Casado", "Separado", "Divorciado")
        estado_Civil_Spinner.adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,estado_Civil_Lista)

        val cargo_Spinner = findViewById<Spinner>(R.id.spinner2)
        val cargo_Lista = listOf("Ventas", "Informática", "Jardinería")
        cargo_Spinner.adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,cargo_Lista)
    }
}