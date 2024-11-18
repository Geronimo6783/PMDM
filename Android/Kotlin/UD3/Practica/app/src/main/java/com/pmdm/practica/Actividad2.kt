package com.pmdm.practica

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Actividad2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actividad2)
        val boton1: Button = findViewById(R.id.Button01)
        val boton3: Button = findViewById(R.id.Button02)

        boton1.setOnClickListener{
            lanzarAActividad1(null)
        }

        boton3.setOnClickListener{
            lanzarAActividad3(null)
        }
    }

    private fun lanzarAActividad1(view: View?){
        val i : Intent = Intent(this, MainActivity::class.java)
        startActivity(i)
    }

    private fun lanzarAActividad3(view: View?){
        val i : Intent = Intent(this, Actividad3::class.java)
        startActivity(i)
    }
}