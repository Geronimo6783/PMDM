package com.pmdm.ud04ej003j;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText campoFilas;

    private EditText campoColumnas;

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
        try {
            int fila = Integer.parseInt(String.valueOf(campoFilas.getText()));
            int columna = Integer.parseInt(String.valueOf(campoColumnas.getText()));
            int colorCelda;

            switch (fila) {
                case 1:
                    switch (columna) {
                        case 1:
                            colorCelda = ((ColorDrawable) celdas[0].getBackground()).getColor();
                            if (colorCelda == VERDE) {
                                celdas[0].setBackgroundColor(ROJO);
                            } else {
                                celdas[0].setBackgroundColor(VERDE);
                            }
                            break;
                        case 2:
                            colorCelda = ((ColorDrawable) celdas[1].getBackground()).getColor();
                            if (colorCelda == VERDE) {
                                celdas[1].setBackgroundColor(ROJO);
                            } else {
                                celdas[1].setBackgroundColor(VERDE);
                            }
                            break;
                        case 3:
                            colorCelda = ((ColorDrawable) celdas[2].getBackground()).getColor();
                            if (colorCelda == VERDE) {
                                celdas[2].setBackgroundColor(ROJO);
                            } else {
                                celdas[2].setBackgroundColor(VERDE);
                            }
                            break;
                        case 4:
                            colorCelda = ((ColorDrawable) celdas[3].getBackground()).getColor();
                            if (colorCelda == VERDE) {
                                celdas[3].setBackgroundColor(ROJO);
                            } else {
                                celdas[3].setBackgroundColor(VERDE);
                            }
                            break;
                    }
                    break;
                case 2:
                    switch (columna) {
                        case 1:
                            colorCelda = ((ColorDrawable) celdas[4].getBackground()).getColor();
                            if (colorCelda == VERDE) {
                                celdas[4].setBackgroundColor(ROJO);
                            } else {
                                celdas[4].setBackgroundColor(VERDE);
                            }
                            break;
                        case 2:
                            colorCelda = ((ColorDrawable) celdas[5].getBackground()).getColor();
                            if (colorCelda == VERDE) {
                                celdas[5].setBackgroundColor(ROJO);
                            } else {
                                celdas[5].setBackgroundColor(VERDE);
                            }
                            break;
                        case 3:
                            colorCelda = ((ColorDrawable) celdas[6].getBackground()).getColor();
                            if (colorCelda == VERDE) {
                                celdas[6].setBackgroundColor(ROJO);
                            } else {
                                celdas[6].setBackgroundColor(VERDE);
                            }
                            break;
                        case 4:
                            colorCelda = ((ColorDrawable) celdas[7].getBackground()).getColor();
                            if (colorCelda == VERDE) {
                                celdas[7].setBackgroundColor(ROJO);
                            } else {
                                celdas[7].setBackgroundColor(VERDE);
                            }
                            break;
                    }
                    break;
                case 3:
                    switch (columna) {
                        case 1:
                            colorCelda = ((ColorDrawable) celdas[8].getBackground()).getColor();
                            if (colorCelda == VERDE) {
                                celdas[8].setBackgroundColor(ROJO);
                            } else {
                                celdas[8].setBackgroundColor(VERDE);
                            }
                            break;
                        case 2:
                            colorCelda = ((ColorDrawable) celdas[9].getBackground()).getColor();
                            if (colorCelda == VERDE) {
                                celdas[9].setBackgroundColor(ROJO);
                            } else {
                                celdas[9].setBackgroundColor(VERDE);
                            }
                            break;
                        case 3:
                            colorCelda = ((ColorDrawable) celdas[10].getBackground()).getColor();
                            if (colorCelda == VERDE) {
                                celdas[10].setBackgroundColor(ROJO);
                            } else {
                                celdas[10].setBackgroundColor(VERDE);
                            }
                            break;
                        case 4:
                            colorCelda = ((ColorDrawable) celdas[11].getBackground()).getColor();
                            if (colorCelda == VERDE) {
                                celdas[11].setBackgroundColor(ROJO);
                            } else {
                                celdas[11].setBackgroundColor(VERDE);
                            }
                            break;
                    }
                    break;
                case 4:
                    switch (columna) {
                        case 1:
                            colorCelda = ((ColorDrawable) celdas[12].getBackground()).getColor();
                            if (colorCelda == VERDE) {
                                celdas[12].setBackgroundColor(ROJO);
                            } else {
                                celdas[12].setBackgroundColor(VERDE);
                            }
                            break;
                        case 2:
                            colorCelda = ((ColorDrawable) celdas[13].getBackground()).getColor();
                            if (colorCelda == VERDE) {
                                celdas[13].setBackgroundColor(ROJO);
                            } else {
                                celdas[13].setBackgroundColor(VERDE);
                            }
                            break;
                        case 3:
                            colorCelda = ((ColorDrawable) celdas[14].getBackground()).getColor();
                            if (colorCelda == VERDE) {
                                celdas[14].setBackgroundColor(ROJO);
                            } else {
                                celdas[14].setBackgroundColor(VERDE);
                            }
                            break;
                        case 4:
                            colorCelda = ((ColorDrawable) celdas[15].getBackground()).getColor();
                            if (colorCelda == VERDE) {
                                celdas[15].setBackgroundColor(ROJO);
                            } else {
                                celdas[15].setBackgroundColor(VERDE);
                            }
                            break;
                    }
                    break;

                case 5:
                    switch (columna) {
                        case 1:
                            colorCelda = ((ColorDrawable) celdas[16].getBackground()).getColor();
                            if (colorCelda == VERDE) {
                                celdas[16].setBackgroundColor(ROJO);
                            } else {
                                celdas[16].setBackgroundColor(VERDE);
                            }
                            break;
                        case 2:
                            colorCelda = ((ColorDrawable) celdas[17].getBackground()).getColor();
                            if (colorCelda == VERDE) {
                                celdas[17].setBackgroundColor(ROJO);
                            } else {
                                celdas[17].setBackgroundColor(VERDE);
                            }
                            break;
                        case 3:
                            colorCelda = ((ColorDrawable) celdas[18].getBackground()).getColor();
                            if (colorCelda == VERDE) {
                                celdas[18].setBackgroundColor(ROJO);
                            } else {
                                celdas[18].setBackgroundColor(VERDE);
                            }
                            break;
                        case 4:
                            colorCelda = ((ColorDrawable) celdas[19].getBackground()).getColor();
                            if (colorCelda == VERDE) {
                                celdas[19].setBackgroundColor(ROJO);
                            } else {
                                celdas[19].setBackgroundColor(VERDE);
                            }
                            break;
                    }
                    break;
            }
        }catch(NumberFormatException e){
            AlertDialog.Builder dialogoDeAlerta = new AlertDialog.Builder(this);

            dialogoDeAlerta.setTitle("Error").setMessage("Introduzca el número de la fila y el número de la columna").setPositiveButton("Continuar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            }).show();
        }
    }
}