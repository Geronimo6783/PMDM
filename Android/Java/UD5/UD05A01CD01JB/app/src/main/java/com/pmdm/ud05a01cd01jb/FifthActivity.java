package com.pmdm.ud05a01cd01jb;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FifthActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fifth);

        //TextView myTextView1 = findViewById(R.id.myTextView1);
        TextView myTextView2 = findViewById(R.id.myTextView2);
        //TextView myTextView3 = findViewById(R.id.myTextView3);

        myTextView2.setGravity(Gravity.CENTER);

        //********************************* Sección Botón *********************************
        // Referencia al botón
        Button buttonNext = findViewById(R.id.button_next);

        // Configurar el listener del botón
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent para saltar a SecondActivity
                Intent intent = new Intent(FifthActivity.this, SixthActivity.class);
                startActivity(intent);
            }
        });

    }
}