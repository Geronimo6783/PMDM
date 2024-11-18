package com.pmdm.ud003ej011k

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity(private val numeroCambios: Int, private val boton1: Button, private val boton2: Button, private val boton3: Button) : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val extra: Bundle? = getIntent().getExtras()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val panelPantallaAnterior: TextView = findViewById(R.id.panelPantallaAnterior)
        val textoPanelPantallaAnterior: String = "Pantalla anterior " + (if ((extras != null)) extras.getInt("Actividad Anterior") else "")
        panelPantallaAnterior.set
    }

    private fun irAActividad1(view: View){
        val i: Intent = Intent(this, MainActivity::class.java)
        i.putExtra("Número Cambios", numeroCambios + 1)
        i.putExtra("Actividad Anterior", 1)
        startActivity(i)
    }

    private fun irAActividad2(view: View){
        val i: Intent = Intent(this, Actividad2::class.java)
        i.putExtra("Número Cambios", numeroCambios + 1)
        i.putExtra("Actividad Anterior", 1)
        startActivity(i)
    }

    private fun irAActividad3(view: View){
        val i: Intent = Intent(this, Actividad3::class.java)
        i.putExtra("Número Cambios", numeroCambios + 1)
        i.putExtra("Actividad Anterior", 1)
        startActivity(i)
    }
}