package com.pmdm.ud04ej003j;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText campoFilas;

    private TextInputEditText campoColumnas;

    private ImageButton botonAccion;

    private TextView[] celdas = new TextView[20];

    private final int ROJO = Color.parseColor("#FF0000");

    private final int VERDE = Color.parseColor("#00FF00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        campoFilas = findViewById(R.id.CampoFilas);
        campoColumnas = findViewById(R.id.CampoColumnas);
        botonAccion = findViewById(R.id.BotonAccion);
        celdas[0] = findViewById(R.id.F0C0);
        celdas[1] = findViewById(R.id.F0C1);
        celdas[2] = findViewById(R.id.F0C2);
        celdas[3] = findViewById(R.id.F0C3);
        celdas[4] = findViewById(R.id.F1C0);
        celdas[5] = findViewById(R.id.F1C1);
        celdas[6] = findViewById(R.id.F1C2);
        celdas[7] = findViewById(R.id.F1C3);
        celdas[8] = findViewById(R.id.F2C0);
        celdas[9] = findViewById(R.id.F2C1);
        celdas[10] = findViewById(R.id.F2C2);
        celdas[11] = findViewById(R.id.F2C3);
        celdas[12] = findViewById(R.id.F3C0);
        celdas[13] = findViewById(R.id.F3C1);
        celdas[14] = findViewById(R.id.F3C2);
        celdas[15] = findViewById(R.id.F3C3);
        celdas[16] = findViewById(R.id.F4C0);
        celdas[17] = findViewById(R.id.F4C1);
        celdas[18] = findViewById(R.id.F4C2);
        celdas[19] = findViewById(R.id.F4C3);

        botonAccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cambiarColorCelda(null);
            }
        });
    }

    private void cambiarColorCelda(View view){
        int fila = Integer.parseInt(String.valueOf(campoFilas.getText()));
        int columna = Integer.parseInt(String.valueOf(campoColumnas.getText()));
        int colorCelda;

        switch(fila){
            case 1:
                switch(columna){
                    case 1:
                        colorCelda = celdas[0].getSolidColor();
                        if(colorCelda == VERDE){
                            celdas[0].setBackgroundColor(ROJO);
                        }
                        else{
                            celdas[0].setBackgroundColor(VERDE);
                        }
                        break;
                    case 2:
                        colorCelda = celdas[1].getSolidColor();
                        if(colorCelda == VERDE){
                            celdas[1].setBackgroundColor(ROJO);
                        }
                        else{
                            celdas[1].setBackgroundColor(VERDE);
                        }
                        break;
                    case 3:
                        colorCelda = celdas[2].getSolidColor();
                        if(colorCelda == VERDE){
                            celdas[2].setBackgroundColor(ROJO);
                        }
                        else{
                            celdas[2].setBackgroundColor(VERDE);
                        }
                        break;
                    case 4:
                        colorCelda = celdas[3].getSolidColor();
                        if(colorCelda == VERDE){
                            celdas[3].setBackgroundColor(ROJO);
                        }
                        else{
                            celdas[3].setBackgroundColor(VERDE);
                        }
                        break;
                }
                break;
            case 2:
                switch(columna){
                    case 1:
                        colorCelda = celdas[4].getSolidColor();
                        if(colorCelda == VERDE){
                            celdas[4].setBackgroundColor(ROJO);
                        }
                        else{
                            celdas[4].setBackgroundColor(VERDE);
                        }
                        break;
                    case 2:
                        colorCelda = celdas[5].getSolidColor();
                        if(colorCelda == VERDE){
                            celdas[5].setBackgroundColor(ROJO);
                        }
                        else{
                            celdas[5].setBackgroundColor(VERDE);
                        }
                        break;
                    case 3:
                        colorCelda = celdas[6].getSolidColor();
                        if(colorCelda == VERDE){
                            celdas[6].setBackgroundColor(ROJO);
                        }
                        else{
                            celdas[6].setBackgroundColor(VERDE);
                        }
                        break;
                    case 4:
                        colorCelda = celdas[7].getSolidColor();
                        if(colorCelda == VERDE){
                            celdas[7].setBackgroundColor(ROJO);
                        }
                        else{
                            celdas[7].setBackgroundColor(VERDE);
                        }
                        break;
                }
                break;
            case 3:
                switch(columna){
                    case 1:
                        colorCelda = celdas[8].getSolidColor();
                        if(colorCelda == VERDE){
                            celdas[8].setBackgroundColor(ROJO);
                        }
                        else{
                            celdas[8].setBackgroundColor(VERDE);
                        }
                        break;
                    case 2:
                        colorCelda = celdas[9].getSolidColor();
                        if(colorCelda == VERDE){
                            celdas[9].setBackgroundColor(ROJO);
                        }
                        else{
                            celdas[9].setBackgroundColor(VERDE);
                        }
                        break;
                    case 3:
                        colorCelda = celdas[10].getSolidColor();
                        if(colorCelda == VERDE){
                            celdas[10].setBackgroundColor(ROJO);
                        }
                        else{
                            celdas[10].setBackgroundColor(VERDE);
                        }
                        break;
                    case 4:
                        colorCelda = celdas[11].getSolidColor();
                        if(colorCelda == VERDE){
                            celdas[11].setBackgroundColor(ROJO);
                        }
                        else{
                            celdas[11].setBackgroundColor(VERDE);
                        }
                        break;
                }
                break;
            case 4:
                switch(columna){
                    case 1:
                        colorCelda = celdas[12].getSolidColor();
                        if(colorCelda == VERDE){
                            celdas[12].setBackgroundColor(ROJO);
                        }
                        else{
                            celdas[12].setBackgroundColor(VERDE);
                        }
                        break;
                    case 2:
                        colorCelda = celdas[13].getSolidColor();
                        if(colorCelda == VERDE){
                            celdas[13].setBackgroundColor(ROJO);
                        }
                        else{
                            celdas[13].setBackgroundColor(VERDE);
                        }
                        break;
                    case 3:
                        colorCelda = celdas[14].getSolidColor();
                        if(colorCelda == VERDE){
                            celdas[14].setBackgroundColor(ROJO);
                        }
                        else{
                            celdas[14].setBackgroundColor(VERDE);
                        }
                        break;
                    case 4:
                        colorCelda = celdas[15].getSolidColor();
                        if(colorCelda == VERDE){
                            celdas[15].setBackgroundColor(ROJO);
                        }
                        else{
                            celdas[15].setBackgroundColor(VERDE);
                        }
                        break;
                }
                break;

            case 5:
                switch(columna){
                    case 1:
                        colorCelda = celdas[16].getSolidColor();
                        if(colorCelda == VERDE){
                            celdas[16].setBackgroundColor(ROJO);
                        }
                        else{
                            celdas[16].setBackgroundColor(VERDE);
                        }
                        break;
                    case 2:
                        colorCelda = celdas[17].getSolidColor();
                        if(colorCelda == VERDE){
                            celdas[17].setBackgroundColor(ROJO);
                        }
                        else{
                            celdas[17].setBackgroundColor(VERDE);
                        }
                        break;
                    case 3:
                        colorCelda = celdas[18].getSolidColor();
                        if(colorCelda == VERDE){
                            celdas[18].setBackgroundColor(ROJO);
                        }
                        else{
                            celdas[18].setBackgroundColor(VERDE);
                        }
                        break;
                    case 4:
                        colorCelda = celdas[19].getSolidColor();
                        if(colorCelda == VERDE){
                            celdas[19].setBackgroundColor(ROJO);
                        }
                        else{
                            celdas[19].setBackgroundColor(VERDE);
                        }
                        break;
                }
                break;
        }
    }
}