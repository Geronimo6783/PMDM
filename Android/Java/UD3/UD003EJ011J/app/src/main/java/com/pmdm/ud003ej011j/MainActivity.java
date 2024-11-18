package com.pmdm.ud003ej011j;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int numeroCambios;

    private Button boton1;

    private Button boton2;

    private Button boton3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle extras = getIntent().getExtras();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView panelPantallaAnterior = findViewById(R.id.panelPantallaAnterior);
        String textoPanelPantallaAnterior = "Pantalla anterior " + ((extras != null) ? extras.getInt("Actividad Anterior") : "");
        panelPantallaAnterior.setText(textoPanelPantallaAnterior);
        numeroCambios = (extras != null) ? extras.getInt("Número Cambios") : 0;
        TextView panelNumeroCambios = findViewById(R.id.numeroCambios);
        panelNumeroCambios.setText(String.format("%d", numeroCambios));
        boton1 = findViewById(R.id.Button01);
        boton2 = findViewById(R.id.Button02);
        boton3 = findViewById(R.id.Button03);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irAActividad1(null);
            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irAActividad2(null);
            }
        });

        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irAActividad3(null);
            }
        });
    }

    private void irAActividad1(View view){
        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("Número Cambios", ++numeroCambios);
        i.putExtra("Actividad Anterior", 1);
        startActivity(i);
    }

    private void irAActividad2(View view){
        Intent i = new Intent(this, Actividad2.class);
        i.putExtra("Número Cambios", ++numeroCambios);
        i.putExtra("Actividad Anterior", 1);
        startActivity(i);
    }

    private void irAActividad3(View view){
        Intent i = new Intent(this, Actividad3.class);
        i.putExtra("Número Cambios", ++numeroCambios);
        i.putExtra("Actividad Anterior", 1);
        startActivity(i);
    }
}