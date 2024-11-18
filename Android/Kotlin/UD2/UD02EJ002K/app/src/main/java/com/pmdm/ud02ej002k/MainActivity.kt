package com.pmdm.ud02ej002k

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editText1: EditText
    private lateinit var editText2: EditText
    private lateinit var sumButton: Button
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Asegúrate de que activity_main.xml tenga los IDs correctos

        // Inicializar las vistas usando findViewById
        editText1 = findViewById(R.id.editText1)
        editText2 = findViewById(R.id.editText2)
        sumButton = findViewById(R.id.sumButton)
        resultTextView = findViewById(R.id.resultTextView)

        // Configurar el listener del botón
        sumButton.setOnClickListener {
            val num1 = editText1.text.toString().toIntOrNull() ?: 0
            val num2 = editText2.text.toString().toIntOrNull() ?: 0
            val sum = num1 + num2

            resultTextView.text = "Resultado: $sum"
        }
    }
}