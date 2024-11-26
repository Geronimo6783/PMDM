package com.pmdm.ud04ej001j;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layoutPrincipal = new LinearLayout(this);
        layoutPrincipal.setOrientation(LinearLayout.VERTICAL);
        layoutPrincipal.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        Button boton1 = new Button(this);
        boton1.setText("Wrap-content");
        boton1.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        Button boton2 = new Button(this);
        boton2.setText("Fill-parent");
        boton2.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        LinearLayout layoutSecundario = new LinearLayout(this);
        layoutSecundario.setOrientation(LinearLayout.VERTICAL);
        layoutSecundario.setBackgroundColor(Color.parseColor("#7701b1d6"));
        layoutSecundario.setLayoutParams(new LinearLayout.LayoutParams(525, ViewGroup.LayoutParams.MATCH_PARENT));
        Button boton3 = new Button(this);
        boton3.setText("Fill-parent");
        boton3.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        layoutSecundario.addView(boton3);
        layoutPrincipal.addView(boton1);
        layoutPrincipal.addView(boton2);
        layoutPrincipal.addView(layoutSecundario);
        setContentView(layoutPrincipal);

    }
}