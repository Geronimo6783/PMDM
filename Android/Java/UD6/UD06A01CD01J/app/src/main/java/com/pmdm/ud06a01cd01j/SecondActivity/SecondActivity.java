package com.pmdm.ud06a01cd01j.SecondActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import com.pmdm.ud06a01cd01j.R;
import com.pmdm.ud06a01cd01j.ThirdActivity.ThirdActivity;


public class SecondActivity extends AppCompatActivity {

        // Declarar las instancias de la lista y el adaptador
        ListView lista;
        Button btnSiguiente;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_second);

            // Inicializar el botón
            btnSiguiente = findViewById(R.id.btn_siguiente);

            // Inicializar la lista y el adaptador
            lista = findViewById(R.id.lista2);

            // Usar el adaptador personalizado con los datos de DataSource.TAREAS
            TareaArrayAdapter<Tarea> adaptador = new TareaArrayAdapter<>(this, DataSource.TAREAS);

            //LLenar los elementos de la lista con el adaptador
            lista.setAdapter(adaptador);

            // Configurar el evento de clic en el botón
            btnSiguiente.setOnClickListener(v -> {
                // Crear un Intent para navegar a SecondActivity
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);
            });
        }
    }