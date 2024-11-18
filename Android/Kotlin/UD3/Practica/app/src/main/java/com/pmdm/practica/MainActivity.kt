package com.pmdm.practica

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val boton2: Button = findViewById(R.id.Button01)
        val boton3: Button = findViewById(R.id.Button02)

        boton2.setOnClickListener{
            lanzarAActividad2(null)
        }

        boton3.setOnClickListener{
            lanzarAActividad3(null)
        }
    }

    private fun lanzarAActividad2(view: View?){
        val i: Intent = Intent(this, Actividad2::class.java)
        startActivity(i)
    }

    private fun lanzarAActividad3(view: View?){
        val i: Intent = Intent(this, Actividad3::class.java)
        startActivity(i)
    }
}