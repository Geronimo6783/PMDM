package com.pmdm.ud03ej012k_receive

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        var extras: Bundle? = getIntent().getExtras()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var vistaTexto: TextView = findViewById(R.id.TextViewMayusculas)

        if(extras != null) {
            var texto: String? = extras.getString(Intent.EXTRA_TEXT)

            if (texto != null) {
                vistaTexto.setText((texto.uppercase()))
            }
        }
    }

    fun salir(view: View){
        finish()
    }
}