package com.pmdm.ud02cd001j;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Obtener el contexto de la actividad
        Context context = this;
        // Obtener una referencia al TextView mediante su ID
        TextView textView = findViewById(R.id.textView);
        // Determinar la orientación de la pantalla
        int orientation = context.getResources().getConfiguration().orientation;
        String mensaje;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            mensaje = "¡El dispositivo está en orientación horizontal!";
        } else if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            mensaje = "¡El dispositivo está en orientación vertical!";
        } else {
            mensaje = "¡Orientación desconocida!";
        }
        // Cambiar el texto del TextView utilizando el contexto
        textView.setText(mensaje);
    }
}