package com.pmdm.ud003ej011k

import android.content.Intent
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Actividad2(private var numeroCambios: Int, private var boton1: Button?, private var boton2: Button?, private var boton3: Button?) : AppCompatActivity() {

    constructor() : this(0, null, null, null)

    override fun onCreate(savedInstanceState: Bundle?) {
        val extras: Bundle? = getIntent().getExtras()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actividad2)
        val panelPantallaAnterior: TextView = findViewById(R.id.panelPantallaAnterior)
        val textoPanelPantallaAnterior: String = "Pantalla anterior " + (if ((extras != null)) extras.getInt("Actividad Anterior") else "")
        panelPantallaAnterior.setText(textoPanelPantallaAnterior)
        numeroCambios = (if (extras != null) extras.getInt("Número Cambios") else 0)
        val panelNumeroCambios: TextView = findViewById(R.id.numeroCambios)
        panelNumeroCambios.setText(String.format("%d", numeroCambios))
        boton1 = findViewById(R.id.Button01)
        boton2 = findViewById(R.id.Button02)
        boton3 = findViewById(R.id.Button03)

        boton1?.setOnClickListener {
            irAActividad1(null)
        }

        boton2?.setOnClickListener{
            irAActividad2(null)
        }

        boton3?.setOnClickListener{
            irAActividad3(null)
        }
    }

    private fun irAActividad1(view: View?){
        val i: Intent = Intent(this, MainActivity::class.java)
        i.putExtra("Número Cambios", numeroCambios + 1)
        i.putExtra("Actividad Anterior", 2)
        startActivity(i)
    }

    private fun irAActividad2(view: View?){
        val i: Intent = Intent(this, Actividad2::class.java)
        i.putExtra("Número Cambios", numeroCambios + 1)
        i.putExtra("Actividad Anterior", 2)
        startActivity(i)
    }

    private fun irAActividad3(view: View?){
        val i: Intent = Intent(this, Actividad3::class.java)
        i.putExtra("Número Cambios", numeroCambios + 1)
        i.putExtra("Actividad Anterior", 2)
        startActivity(i)
    }
}