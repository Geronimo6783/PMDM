package com.pmdm.ud06a01cd01j;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.pmdm.ud06a01cd01j.SecondActivity.SecondActivity;

public class MainActivity extends AppCompatActivity {

    // Declarar las instancias de la lista y el adaptador
    ListView lista;
    ArrayAdapter<String> adaptador;
    Button btnSiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializar la lista y el adaptador
        lista = findViewById(R.id.lista);

        String[] arregloCadenas = {"Tarea 1", "Tarea 2", "Tarea 3"};

        // Inicializar el adaptador
        adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arregloCadenas);

        //LLenar los elementos de la lista con el adaptador
        lista.setAdapter(adaptador);

        // Configurar el evento de clic en los elementos de la lista
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Obtener el elemento pulsado
                String itemSeleccionado = (String) parent.getItemAtPosition(position);

                // Mostrar un Toast con el índice y el contenido
                Toast.makeText(MainActivity.this, "Índice: " + position + ", Elemento: " + itemSeleccionado, Toast.LENGTH_SHORT).show();
            }
        });

        /*
        El método onItemClick tiene cuatro parámetros:

        parent: Referencia al adaptador que contiene los datos.
        view: Vista que fue clicada.
        position: Posición del elemento en la lista (empieza desde 0).
        id: ID del elemento clicado (puede ser igual a position en este caso).

        */

        // Inicializar el botón
        btnSiguiente = findViewById(R.id.btn_siguiente);

        // Configurar el evento de clic en el botón
        btnSiguiente.setOnClickListener(v -> {
            // Crear un Intent para navegar a SecondActivity
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        });
    }
}