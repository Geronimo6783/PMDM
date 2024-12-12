package com.pmdm.ud04ej004j;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.ImageDecoder;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private static final TextView[] celdas = new TextView[20];

    private static final int BLANCO = Color.parseColor("#FFFFFF");

    private static final int ROJO = Color.parseColor("#FF0000");

    private int fila = new Random().nextInt(5) + 1;

    private int columna = new Random().nextInt(4) + 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

        cambiarColorCelda(fila, columna);

        ImageButton botonArriba = findViewById(R.id.BotonArriba);
        ImageButton botonDerecha = findViewById(R.id.BotonDerecha);
        ImageButton botonIzquierda = findViewById(R.id.BotonIzquierda);
        ImageButton botonAbajo = findViewById(R.id.BotonAbajo);

        botonArriba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(fila > 1) {
                    cambiarColorCelda(fila, columna);
                    fila--;
                    cambiarColorCelda(fila, columna);
                }
                else{
                    AlertDialog.Builder dialogoDeAlerta = new AlertDialog.Builder(MainActivity.this);
                    dialogoDeAlerta.setTitle("Se está saliendo del espacio permitido").setPositiveButton("Continuar",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    dialogInterface.dismiss();
                                }
                            }).show();
                }
            }
        });

        botonDerecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(columna < 4) {
                    cambiarColorCelda(fila, columna);
                    columna++;
                    cambiarColorCelda(fila, columna);
                }
                else{
                    AlertDialog.Builder dialogoDeAlerta = new AlertDialog.Builder(MainActivity.this);
                    dialogoDeAlerta.setTitle("Se está saliendo del espacio permitido").setPositiveButton("Continuar",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    dialogInterface.dismiss();
                                }
                            }).show();
                }
            }
        });

        botonAbajo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(fila < 5) {
                    cambiarColorCelda(fila, columna);
                    fila++;
                    cambiarColorCelda(fila, columna);
                }
                else{
                    AlertDialog.Builder dialogoDeAlerta = new AlertDialog.Builder(MainActivity.this);
                    dialogoDeAlerta.setTitle("Se está saliendo del espacio permitido").setPositiveButton("Continuar",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    dialogInterface.dismiss();
                                }
                            }).show();
                }
            }
        });

        botonIzquierda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(columna > 1) {
                    cambiarColorCelda(fila, columna);
                    columna--;
                    cambiarColorCelda(fila, columna);
                }
                else{
                    AlertDialog.Builder dialogoDeAlerta = new AlertDialog.Builder(MainActivity.this);
                    dialogoDeAlerta.setTitle("Se está saliendo del espacio permitido").setPositiveButton("Continuar",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    dialogInterface.dismiss();
                                }
                            }).show();
                }
            }
        });
    }

    private void cambiarColorCelda(int fila, int columna){
        int colorCelda;
        switch (fila) {
            case 1:
                switch (columna) {
                    case 1:
                        colorCelda = ((ColorDrawable) celdas[0].getBackground()).getColor();
                        if (colorCelda == BLANCO) {
                            celdas[0].setBackgroundColor(ROJO);
                        } else {
                            celdas[0].setBackgroundColor(BLANCO);
                        }
                        break;
                    case 2:
                        colorCelda = ((ColorDrawable) celdas[1].getBackground()).getColor();
                        if (colorCelda == BLANCO) {
                            celdas[1].setBackgroundColor(ROJO);
                        } else {
                            celdas[1].setBackgroundColor(BLANCO);
                        }
                        break;
                    case 3:
                        colorCelda = ((ColorDrawable) celdas[2].getBackground()).getColor();
                        if (colorCelda == BLANCO) {
                            celdas[2].setBackgroundColor(ROJO);
                        } else {
                            celdas[2].setBackgroundColor(BLANCO);
                        }
                        break;
                    case 4:
                        colorCelda = ((ColorDrawable) celdas[3].getBackground()).getColor();
                        if (colorCelda == BLANCO) {
                            celdas[3].setBackgroundColor(ROJO);
                        } else {
                            celdas[3].setBackgroundColor(BLANCO);
                        }
                        break;
                }
                break;
            case 2:
                switch (columna) {
                    case 1:
                        colorCelda = ((ColorDrawable) celdas[4].getBackground()).getColor();
                        if (colorCelda == BLANCO) {
                            celdas[4].setBackgroundColor(ROJO);
                        } else {
                            celdas[4].setBackgroundColor(BLANCO);
                        }
                        break;
                    case 2:
                        colorCelda = ((ColorDrawable) celdas[5].getBackground()).getColor();
                        if (colorCelda == BLANCO) {
                            celdas[5].setBackgroundColor(ROJO);
                        } else {
                            celdas[5].setBackgroundColor(BLANCO);
                        }
                        break;
                    case 3:
                        colorCelda = ((ColorDrawable) celdas[6].getBackground()).getColor();
                        if (colorCelda == BLANCO) {
                            celdas[6].setBackgroundColor(ROJO);
                        } else {
                            celdas[6].setBackgroundColor(BLANCO);
                        }
                        break;
                    case 4:
                        colorCelda = ((ColorDrawable) celdas[7].getBackground()).getColor();
                        if (colorCelda == BLANCO) {
                            celdas[7].setBackgroundColor(ROJO);
                        } else {
                            celdas[7].setBackgroundColor(BLANCO);
                        }
                        break;
                }
                break;
            case 3:
                switch (columna) {
                    case 1:
                        colorCelda = ((ColorDrawable) celdas[8].getBackground()).getColor();
                        if (colorCelda == BLANCO) {
                            celdas[8].setBackgroundColor(ROJO);
                        } else {
                            celdas[8].setBackgroundColor(BLANCO);
                        }
                        break;
                    case 2:
                        colorCelda = ((ColorDrawable) celdas[9].getBackground()).getColor();
                        if (colorCelda == BLANCO) {
                            celdas[9].setBackgroundColor(ROJO);
                        } else {
                            celdas[9].setBackgroundColor(BLANCO);
                        }
                        break;
                    case 3:
                        colorCelda = ((ColorDrawable) celdas[10].getBackground()).getColor();
                        if (colorCelda == BLANCO) {
                            celdas[10].setBackgroundColor(ROJO);
                        } else {
                            celdas[10].setBackgroundColor(BLANCO);
                        }
                        break;
                    case 4:
                        colorCelda = ((ColorDrawable) celdas[11].getBackground()).getColor();
                        if (colorCelda == BLANCO) {
                            celdas[11].setBackgroundColor(ROJO);
                        } else {
                            celdas[11].setBackgroundColor(BLANCO);
                        }
                        break;
                }
                break;
            case 4:
                switch (columna) {
                    case 1:
                        colorCelda = ((ColorDrawable) celdas[12].getBackground()).getColor();
                        if (colorCelda == BLANCO) {
                            celdas[12].setBackgroundColor(ROJO);
                        } else {
                            celdas[12].setBackgroundColor(BLANCO);
                        }
                        break;
                    case 2:
                        colorCelda = ((ColorDrawable) celdas[13].getBackground()).getColor();
                        if (colorCelda == BLANCO) {
                            celdas[13].setBackgroundColor(ROJO);
                        } else {
                            celdas[13].setBackgroundColor(BLANCO);
                        }
                        break;
                    case 3:
                        colorCelda = ((ColorDrawable) celdas[14].getBackground()).getColor();
                        if (colorCelda == BLANCO) {
                            celdas[14].setBackgroundColor(ROJO);
                        } else {
                            celdas[14].setBackgroundColor(BLANCO);
                        }
                        break;
                    case 4:
                        colorCelda = ((ColorDrawable) celdas[15].getBackground()).getColor();
                        if (colorCelda == BLANCO) {
                            celdas[15].setBackgroundColor(ROJO);
                        } else {
                            celdas[15].setBackgroundColor(BLANCO);
                        }
                        break;
                }
                break;

            case 5:
                switch (columna) {
                    case 1:
                        colorCelda = ((ColorDrawable) celdas[16].getBackground()).getColor();
                        if (colorCelda == BLANCO) {
                            celdas[16].setBackgroundColor(ROJO);
                        } else {
                            celdas[16].setBackgroundColor(BLANCO);
                        }
                        break;
                    case 2:
                        colorCelda = ((ColorDrawable) celdas[17].getBackground()).getColor();
                        if (colorCelda == BLANCO) {
                            celdas[17].setBackgroundColor(ROJO);
                        } else {
                            celdas[17].setBackgroundColor(BLANCO);
                        }
                        break;
                    case 3:
                        colorCelda = ((ColorDrawable) celdas[18].getBackground()).getColor();
                        if (colorCelda == BLANCO) {
                            celdas[18].setBackgroundColor(ROJO);
                        } else {
                            celdas[18].setBackgroundColor(BLANCO);
                        }
                        break;
                    case 4:
                        colorCelda = ((ColorDrawable) celdas[19].getBackground()).getColor();
                        if (colorCelda == BLANCO) {
                            celdas[19].setBackgroundColor(ROJO);
                        } else {
                            celdas[19].setBackgroundColor(BLANCO);
                        }
                        break;
                }
                break;
        }
    }
}