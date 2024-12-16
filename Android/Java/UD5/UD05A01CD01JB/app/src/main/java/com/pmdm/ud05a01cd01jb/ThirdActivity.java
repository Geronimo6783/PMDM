package com.pmdm.ud05a01cd01jb;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_third);

        TextView myTextView2 = findViewById(R.id.myTextView2);
        TextView myTextView3 = findViewById(R.id.myTextView3);

        //Personalización del TextView mediante código
        myTextView2.setTextSize(20); // En "sp"
        myTextView2.setTextColor(Color.parseColor("#FF5722"));
        myTextView2.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD_ITALIC);

        myTextView3.setPadding(8, 8, 8, 8); // En "px"

        //********************************* Sección Botón *********************************
        // Referencia al botón
        Button buttonNext = findViewById(R.id.button_next);

        // Configurar el listener del botón
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent para saltar a SecondActivity
                Intent intent = new Intent(ThirdActivity.this, FourthActivity.class);
                startActivity(intent);
            }
        });

    }
}