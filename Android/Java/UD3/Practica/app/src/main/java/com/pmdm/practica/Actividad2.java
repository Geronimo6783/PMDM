package com.pmdm.practica;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

public class Actividad2 extends AppCompatActivity {

    private Button boton1;

    private Button boton3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad2);
        boton1 = findViewById(R.id.Button01);
        boton3 = findViewById(R.id.Button02);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irAActividad1(null);
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
        startActivity(i);
    }

    private void irAActividad3(View view){
        Intent i = new Intent(this, Actividad3.class);
        startActivity(i);
    }
}
