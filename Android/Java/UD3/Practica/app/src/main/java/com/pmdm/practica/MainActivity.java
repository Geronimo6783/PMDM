package com.pmdm.practica;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button boton2;

    private Button boton3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton2 = findViewById(R.id.Button01);
        boton3 = findViewById(R.id.Button02);

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

    private void irAActividad2(View view){
        Intent i = new Intent(this, Actividad2.class);
        startActivity(i);
    }

    private void irAActividad3(View view){
        Intent i = new Intent(this, Actividad3.class);
        startActivity(i);
    }
}