package com.pmdm.ud08a11cd01j;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class FifthActivity extends AppCompatActivity {

    private static final String PREFS_NAME = "theme_prefs";
    private static final String KEY_THEME_MODE = "theme_mode";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Aplicar el tema guardado al iniciar
        aplicarTemaGuardado();

        setContentView(R.layout.activity_fifth);


        FloatingActionButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(view -> {
            int currentNightMode = AppCompatDelegate.getDefaultNightMode();

            if (currentNightMode == AppCompatDelegate.MODE_NIGHT_YES) {
                cambiarTema(AppCompatDelegate.MODE_NIGHT_NO);
            } else {
                cambiarTema(AppCompatDelegate.MODE_NIGHT_YES);
            }

            // Reiniciar la actividad para aplicar el cambio
            recreate();
        });
    }

    private void aplicarTemaGuardado() {
        SharedPreferences prefs = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        int temaGuardado = prefs.getInt(KEY_THEME_MODE, AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM);

        AppCompatDelegate.setDefaultNightMode(temaGuardado);
    }

    private void cambiarTema(int modo) {
        SharedPreferences prefs = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt(KEY_THEME_MODE, modo);
        editor.apply();

        AppCompatDelegate.setDefaultNightMode(modo);
    }
}
