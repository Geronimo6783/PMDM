package com.pmdm.practica

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Actividad3 : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actividad3)
        val boton1: Button = findViewById(R.id.Button01)
        val boton2: Button = findViewById(R.id.Button02)

        boton1.setOnClickListener{

        }

        boton2.setOnClickListener{

        }
    }

    private fun irAActividad1(view: View?){
        val i: Intent = Intent(this, MainActivity::class.java)
        startActivity(i)
    }

    private fun irAActividad2(view: View?){
        val i: Intent = Intent(this, Actividad2::class.java)
        startActivity(i)
    }
}