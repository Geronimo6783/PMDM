package com.pmdm.ud05a01cd01jb;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);

        TextView myTextView = new TextView(this);
        myTextView.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        myTextView.setText("¡Hola, Mundo!");
        myTextView.setTextSize(18);
        myTextView.setTextColor(Color.BLUE);
        myTextView.setGravity(Gravity.CENTER);
        myTextView.setPadding(16, 16, 16, 16);

        // Añadir el TextView al layout principal
        LinearLayout layout = findViewById(R.id.LinearLayout);
        layout.addView(myTextView);

        // Referencia al botón
        Button buttonNext = findViewById(R.id.button_next);

        // Configurar el listener del botón
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent para saltar a SecondActivity
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });

    }
}