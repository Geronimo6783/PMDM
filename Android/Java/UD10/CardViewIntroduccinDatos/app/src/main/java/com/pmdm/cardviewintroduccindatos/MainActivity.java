package com.pmdm.cardviewintroduccindatos;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Switch cambiadorTemas = findViewById(R.id.cambioTema);
        cambiadorTemas.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    cambiarAOscuro(null);
                }
                else{
                    cambiarAClaro(null);
                }
            }
        });
    }

    private void cambiarAOscuro(View view){
        onNightModeChanged(AppCompatDelegate.MODE_NIGHT_YES);
    }

    private void cambiarAClaro(View view){
        onNightModeChanged(AppCompatDelegate.MODE_NIGHT_NO);
    }
}