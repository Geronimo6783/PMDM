package com.pmdm.practica;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Actividad3 extends AppCompatActivity {

    private Button boton1;

    private Button boton2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad3);
        boton1 = findViewById(R.id.Button01);
        boton2 = findViewById(R.id.Button02);

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
    }

    private void irAActividad1(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    private void irAActividad2(View view){
        Intent i = new Intent(this, Actividad2.class);
        startActivity(i);
    }
}
