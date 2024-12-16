package com.pmdm.ud05a01cd01jb;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SeventhActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_seventh);

        //TextView myTextView1 = findViewById(R.id.myTextView1);
        //TextView myTextView2 = findViewById(R.id.myTextView2);
        //TextView myTextView3 = findViewById(R.id.myTextView3);

        CustomTextView customTextView = findViewById(R.id.customTextView2);
        customTextView.setText("Texto modificado programáticamente");
        customTextView.setCustomFontSize(32);
        customTextView.setCustomTextColor(Color.GREEN);


        //********************************* Sección Botón *********************************
        // Referencia al botón
        Button buttonNext = findViewById(R.id.button_next);

        // Configurar el listener del botón
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent para saltar a SecondActivity
                Intent intent = new Intent(SeventhActivity.this, EightActivity.class);
                startActivity(intent);
            }
        });

    }
}