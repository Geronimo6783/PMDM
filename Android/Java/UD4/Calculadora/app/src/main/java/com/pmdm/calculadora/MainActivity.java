package com.pmdm.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private TextView panelTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        panelTexto = findViewById(R.id.PanelTexto);
    }

    public void anadirBarra(View view){
        String textoPanel = panelTexto.getText().toString();
        textoPanel += "/";
        panelTexto.setText(textoPanel);
    }

    public void anadirAsterisco(View view){
        String textoPanel = panelTexto.getText().toString();
        textoPanel += "*";
        panelTexto.setText(textoPanel);
    }

    public void anadirMas(View view){
        String textoPanel = panelTexto.getText().toString();
        textoPanel += "+";
        panelTexto.setText(textoPanel);
    }

    public void anadirSiete(View view){
        String textoPanel = panelTexto.getText().toString();
        textoPanel += "7";
        panelTexto.setText(textoPanel);
    }

    public void anadirOcho(View view){
        String textoPanel = panelTexto.getText().toString();
        textoPanel += "8";
        panelTexto.setText(textoPanel);
    }

    public void anadirNueve(View view){
        String textoPanel = panelTexto.getText().toString();
        textoPanel += "9";
        panelTexto.setText(textoPanel);
    }

    public void anadirCuatro(View view){
        String textoPanel = panelTexto.getText().toString();
        textoPanel += "4";
        panelTexto.setText(textoPanel);
    }

    public void anadirCinco(View view){
        String textoPanel = panelTexto.getText().toString();
        textoPanel += "5";
        panelTexto.setText(textoPanel);
    }

    public void anadirSeis(View view){
        String textoPanel = panelTexto.getText().toString();
        textoPanel += "6";
        panelTexto.setText(textoPanel);
    }

    public void anadirTres(View view){
        String textoPanel = panelTexto.getText().toString();
        textoPanel += "3";
        panelTexto.setText(textoPanel);
    }

    public void anadirDos(View view){
        String textoPanel = panelTexto.getText().toString();
        textoPanel += "2";
        panelTexto.setText(textoPanel);
    }

    public void anadirUno(View view){
        String textoPanel = panelTexto.getText().toString();
        textoPanel += "1";
        panelTexto.setText(textoPanel);
    }

    public void anadirCero(View view){
        String textoPanel = panelTexto.getText().toString();
        textoPanel += "0";
        panelTexto.setText(textoPanel);
    }

    public void anadirIgual(View view){
        String textoPanel = panelTexto.getText().toString();
        textoPanel += "=";
        panelTexto.setText(textoPanel);
    }
}