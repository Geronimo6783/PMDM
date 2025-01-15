package com.pmdm.ud06a01cd01j.ThirdActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.pmdm.ud06a01cd01j.FourthActivity.FourthActivity;
import com.pmdm.ud06a01cd01j.R;

import java.util.ArrayList;

public class ThirdActivity extends AppCompatActivity {

    // Declarar las instancias de la lista y el adaptador
    ListView lista;
    ListView lista2;
    ArrayAdapter<String> adaptador;
    ArrayList<String> listaTareas; // Aquí se almacenarán las tareas
    Button btnSiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        /*--****************** Adaptador 1 ******************--*/

        // Inicializar la lista y el adaptador
        lista = findViewById(R.id.lista3);

        // Inicializar la lista de tareas
        listaTareas = new ArrayList<>();
        listaTareas.add("Tarea A");
        listaTareas.add("Tarea B");
        listaTareas.add("Tarea C");

        // Inicializar el adaptador
        CustomAdapter customAdapter = new CustomAdapter(this, listaTareas);

        //LLenar los elementos de la lista con el adaptador
        lista.setAdapter(customAdapter);

        /*--****************** Adaptador 2 ******************--*/

        // Inicializar la lista y el adaptador
        lista2 = findViewById(R.id.lista3b);

        String[] arregloCadenas = {"Tarea 1", "Tarea 2", "Tarea 3"};

        // Inicializar el adaptador
        adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arregloCadenas);

        //LLenar los elementos de la lista con el adaptador
        lista2.setAdapter(adaptador);



        // Inicializar el botón
        btnSiguiente = findViewById(R.id.btn_siguiente);

        // Configurar el evento de clic en el botón
        btnSiguiente.setOnClickListener(v -> {
            // Crear un Intent para navegar a SecondActivity
            Intent intent = new Intent(ThirdActivity.this, FourthActivity.class);
            startActivity(intent);
        });
    }
}