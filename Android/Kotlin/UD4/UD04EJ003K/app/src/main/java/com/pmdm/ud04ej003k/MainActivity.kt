package com.pmdm.ud04ej003k

import android.content.DialogInterface
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity(private var campoFilas: TextInputEditText?, private var campoColumnas: TextInputEditText?, private var botonAccion: ImageButton?, private var celdas: Array<TextView?>,
                   private val ROJO: Int = Color.parseColor("#FF0000"), private val VERDE: Int = Color.parseColor("#00FF00")) : AppCompatActivity() {

     constructor() : this(null, null, null, Array<TextView?>(20) {null}, Color.parseColor("#FF0000"), Color.parseColor("#00FF00")) {

     }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        campoFilas = findViewById(R.id.CampoFilas)
        campoColumnas = findViewById(R.id.CampoColumnas)
        botonAccion = findViewById(R.id.BotonAccion)
        celdas[0] = findViewById(R.id.F0C0)
        celdas[1] = findViewById(R.id.F0C1)
        celdas[2] = findViewById(R.id.F0C2)
        celdas[3] = findViewById(R.id.F0C3)
        celdas[4] = findViewById(R.id.F1C0)
        celdas[5] = findViewById(R.id.F1C1)
        celdas[6] = findViewById(R.id.F1C2)
        celdas[7] = findViewById(R.id.F1C3)
        celdas[8] = findViewById(R.id.F2C0)
        celdas[9] = findViewById(R.id.F2C1)
        celdas[10] = findViewById(R.id.F2C2)
        celdas[11] = findViewById(R.id.F2C3)
        celdas[12] = findViewById(R.id.F3C0)
        celdas[13] = findViewById(R.id.F3C1)
        celdas[14] = findViewById(R.id.F3C2)
        celdas[15] = findViewById(R.id.F3C3)
        celdas[16] = findViewById(R.id.F4C0)
        celdas[17] = findViewById(R.id.F4C1)
        celdas[18] = findViewById(R.id.F4C2)
        celdas[19] = findViewById(R.id.F4C3)

        botonAccion?.setOnClickListener(OnClickListener{ cambiarColorCelda(null) })
    }

    private fun cambiarColorCelda(view : View?){
        try{
            var fila: Int = campoFilas!!.text.toString().toInt()
            var columna: Int = campoColumnas!!.text.toString().toInt()
            var colorCelda: Int

            when(fila){

                1 -> {
                    when(columna){
                        1 ->{
                            colorCelda = (celdas[0]!!.background as ColorDrawable).color
                            if(colorCelda == VERDE){
                                celdas[0]!!.setBackgroundColor(ROJO)
                            }else{
                                celdas[0]!!.setBackgroundColor(VERDE)
                            }
                        }
                        2 ->{
                            colorCelda = (celdas[1]!!.background as ColorDrawable).color
                            if(colorCelda == VERDE){
                                celdas[1]!!.setBackgroundColor(ROJO)
                            }else{
                                celdas[1]!!.setBackgroundColor(VERDE)
                            }
                        }
                        3 ->{
                            colorCelda = (celdas[2]!!.background as ColorDrawable).color
                            if(colorCelda == VERDE){
                                celdas[2]!!.setBackgroundColor(ROJO)
                            }else{
                                celdas[2]!!.setBackgroundColor(VERDE)
                            }
                        }
                        4 ->{
                            colorCelda = (celdas[3]!!.background as ColorDrawable).color
                            if(colorCelda == VERDE){
                                celdas[3]!!.setBackgroundColor(ROJO)
                            }else{
                                celdas[3]!!.setBackgroundColor(VERDE)
                            }
                        }
                    }
                }

                2 -> {
                    when(columna){
                        1 ->{
                            colorCelda = (celdas[4]!!.background as ColorDrawable).color
                            if(colorCelda == VERDE){
                                celdas[4]!!.setBackgroundColor(ROJO)
                            }else{
                                celdas[4]!!.setBackgroundColor(VERDE)
                            }
                        }
                        2 ->{
                            colorCelda = (celdas[5]!!.background as ColorDrawable).color
                            if(colorCelda == VERDE){
                                celdas[5]!!.setBackgroundColor(ROJO)
                            }else{
                                celdas[5]!!.setBackgroundColor(VERDE)
                            }
                        }
                        3 ->{
                            colorCelda = (celdas[6]!!.background as ColorDrawable).color
                            if(colorCelda == VERDE){
                                celdas[6]!!.setBackgroundColor(ROJO)
                            }else{
                                celdas[6]!!.setBackgroundColor(VERDE)
                            }
                        }
                        4 ->{
                            colorCelda = (celdas[7]!!.background as ColorDrawable).color
                            if(colorCelda == VERDE){
                                celdas[7]!!.setBackgroundColor(ROJO)
                            }else{
                                celdas[7]!!.setBackgroundColor(VERDE)
                            }
                        }
                    }
                }

                3 -> {
                    when(columna){
                        1 ->{
                            colorCelda = (celdas[8]!!.background as ColorDrawable).color
                            if(colorCelda == VERDE){
                                celdas[8]!!.setBackgroundColor(ROJO)
                            }else{
                                celdas[8]!!.setBackgroundColor(VERDE)
                            }
                        }
                        2 ->{
                            colorCelda = (celdas[9]!!.background as ColorDrawable).color
                            if(colorCelda == VERDE){
                                celdas[9]!!.setBackgroundColor(ROJO)
                            }else{
                                celdas[9]!!.setBackgroundColor(VERDE)
                            }
                        }
                        3 ->{
                            colorCelda = (celdas[10]!!.background as ColorDrawable).color
                            if(colorCelda == VERDE){
                                celdas[10]!!.setBackgroundColor(ROJO)
                            }else{
                                celdas[10]!!.setBackgroundColor(VERDE)
                            }
                        }
                        4 ->{
                            colorCelda = (celdas[11]!!.background as ColorDrawable).color
                            if(colorCelda == VERDE){
                                celdas[11]!!.setBackgroundColor(ROJO)
                            }else{
                                celdas[11]!!.setBackgroundColor(VERDE)
                            }
                        }
                    }
                }

                4 -> {
                    when(columna){
                        1 ->{
                            colorCelda = (celdas[12]!!.background as ColorDrawable).color
                            if(colorCelda == VERDE){
                                celdas[12]!!.setBackgroundColor(ROJO)
                            }else{
                                celdas[12]!!.setBackgroundColor(VERDE)
                            }
                        }
                        2 ->{
                            colorCelda = (celdas[13]!!.background as ColorDrawable).color
                            if(colorCelda == VERDE){
                                celdas[13]!!.setBackgroundColor(ROJO)
                            }else{
                                celdas[13]!!.setBackgroundColor(VERDE)
                            }
                        }
                        3 ->{
                            colorCelda = (celdas[14]!!.background as ColorDrawable).color
                            if(colorCelda == VERDE){
                                celdas[14]!!.setBackgroundColor(ROJO)
                            }else{
                                celdas[14]!!.setBackgroundColor(VERDE)
                            }
                        }
                        4 ->{
                            colorCelda = (celdas[15]!!.background as ColorDrawable).color
                            if(colorCelda == VERDE){
                                celdas[15]!!.setBackgroundColor(ROJO)
                            }else{
                                celdas[15]!!.setBackgroundColor(VERDE)
                            }
                        }
                    }
                }

                5 -> {
                    when(columna){
                        1 ->{
                            colorCelda = (celdas[16]!!.background as ColorDrawable).color
                            if(colorCelda == VERDE){
                                celdas[16]!!.setBackgroundColor(ROJO)
                            }else{
                                celdas[16]!!.setBackgroundColor(VERDE)
                            }
                        }
                        2 ->{
                            colorCelda = (celdas[17]!!.background as ColorDrawable).color
                            if(colorCelda == VERDE){
                                celdas[17]!!.setBackgroundColor(ROJO)
                            }else{
                                celdas[17]!!.setBackgroundColor(VERDE)
                            }
                        }
                        3 ->{
                            colorCelda = (celdas[18]!!.background as ColorDrawable).color
                            if(colorCelda == VERDE){
                                celdas[18]!!.setBackgroundColor(ROJO)
                            }else{
                                celdas[18]!!.setBackgroundColor(VERDE)
                            }
                        }
                        4 ->{
                            colorCelda = (celdas[19]!!.background as ColorDrawable).color
                            if(colorCelda == VERDE){
                                celdas[19]!!.setBackgroundColor(ROJO)
                            }else{
                                celdas[19]!!.setBackgroundColor(VERDE)
                            }
                        }
                    }
                }
            }

        }
        catch(e: NumberFormatException){
            var dialogoAlerta: AlertDialog.Builder = AlertDialog.Builder(this)

            dialogoAlerta.setTitle("Error").setMessage("Introduzca el número de la fila y el número de la columna").setPositiveButton("Continuar", DialogInterface.OnClickListener{
                dialog, which -> dialog.dismiss()
            }).show()
        }
    }
}