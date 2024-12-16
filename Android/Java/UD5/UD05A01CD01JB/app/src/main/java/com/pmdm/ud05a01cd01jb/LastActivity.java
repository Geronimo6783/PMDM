package com.pmdm.ud05a01cd01jb;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class LastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_last);
        
        CustomTextView3 customTextView = new CustomTextView3(this);

        // Configura dinámicamente las propiedades
        customTextView.setTitle("Dynamic Title");
        customTextView.setSubtitle("Dynamic Subtitle");
        customTextView.setTitleColor(Color.RED);
        customTextView.setSubtitleColor(Color.DKGRAY);
        customTextView.setColorBar(Color.GREEN);
        customTextView.setBackgroundColor(Color.YELLOW);

        // Configura LayoutParams para tamaño y márgenes
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                200  // Altura similar al XML (puedes ajustar)
        );
        params.setMargins(0, 10, 0, 10); // Márgenes similares al XML
        customTextView.setLayoutParams(params);

        // Agrega la vista al LinearLayout
        LinearLayout layout = findViewById(R.id.LinearLayout);
        layout.addView(customTextView);

        //Altura fija: Establece una altura de 200dp para coincidir visualmente con la definición XML.
        //Márgenes: Configura márgenes dinámicos (setMargins) como en XML para alinear las vistas correctamente.
        //Propiedades visuales: Configura setBackgroundColor y otros métodos para asegurar consistencia.


        //********************************* Sección Botón *********************************
        // Referencia al botón
        Button buttonNext = findViewById(R.id.button_next);

        // Configurar el listener del botón
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent para saltar a SecondActivity
                Intent intent = new Intent(LastActivity.this, LastActivity.class);
                startActivity(intent);
            }
        });

    }
}