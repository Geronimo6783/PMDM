package com.pmdm.faltarclase;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;
import com.pmdm.faltarclase.bd.BD;
import com.pmdm.faltarclase.bd.DTODatos;

public class MainActivity extends AppCompatActivity {

    private BD baseDeDatos;

    private TextInputLayout modelo;

    private TextInputLayout id;

    private TextInputLayout kilometros;

    private TextInputLayout asignatura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        baseDeDatos = new BD(this);
        modelo = findViewById(R.id.modelo);
        id = findViewById(R.id.idCoche);
        kilometros = findViewById(R.id.kilometros);
        asignatura = findViewById(R.id.asignatura);
        Button guardar = findViewById(R.id.guardar);
        Button recuperar = findViewById(R.id.recuperar);
        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guardar(null);
            }
        });
        recuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recuperar(null);
            }
        });
    }

    private void guardar(View view){
        int kilometros = 0;
        boolean error = false;

        try{
            kilometros = Integer.parseInt(this.kilometros.getEditText().getText().toString());
        }
        catch(NumberFormatException | NullPointerException e){
            error = true;
            mostrarDialogo("No se ha introducido un número en el campo de los kilómetros.");
        }

        if(!error) {
            baseDeDatos.insertarDatos(modelo.getEditText().getText().toString(), kilometros, asignatura.getEditText().getText().toString());
        }
    }

    public void recuperar(View view){
        try {
            DTODatos datos = baseDeDatos.obtenerDatos(Integer.parseInt(id.getEditText().getText().toString()));

            if (datos != null) {
                mostrarDialogo(datos.toString());
                modelo.getEditText().setText(datos.getModelo());
                kilometros.getEditText().setText(String.valueOf(datos.getKilometros()));
                asignatura.getEditText().setText(datos.getAsignatura());
            } else {
                mostrarDialogo("No hay un registro con dicho id.");
            }
        }
        catch(NumberFormatException e){
            mostrarDialogo("No se ha introducido ningún id válido.");
        }
    }

    private void mostrarDialogo(String mensaje){
        AlertDialog.Builder constructorDialogo = new AlertDialog.Builder(this);
        constructorDialogo.setMessage(mensaje)
                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).show();
    }
}