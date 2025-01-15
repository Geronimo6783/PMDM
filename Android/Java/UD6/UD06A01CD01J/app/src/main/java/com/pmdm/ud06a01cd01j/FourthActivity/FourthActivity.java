package com.pmdm.ud06a01cd01j.FourthActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import com.pmdm.ud06a01cd01j.R;
import com.pmdm.ud06a01cd01j.SecondActivity.Tarea;

import java.util.ArrayList;


public class FourthActivity extends AppCompatActivity {

    ListView lista;
    Button btnSiguiente;
    TareaArrayAdapter2 adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        // Inicializar el botón y la lista
        btnSiguiente = findViewById(R.id.btn_siguiente);
        lista = findViewById(R.id.lista);

        // Crear una lista de tareas
        ArrayList<Tarea> listaTareas = new ArrayList<>();
        listaTareas.add(new Tarea("Trotar 20 minutos", "08:00"));
        listaTareas.add(new Tarea("Estudiar análisis técnico", "10:00"));
        listaTareas.add(new Tarea("Comer 4 rebanadas de manzana", "10:30"));

        // Inicializar el adaptador personalizado
        adaptador = new TareaArrayAdapter2(this, listaTareas);

        // Llenar los elementos de la lista con el adaptador
        lista.setAdapter(adaptador);

        // Configurar el evento de clic en el botón
        btnSiguiente.setOnClickListener(v -> finish()); // Finaliza la actividad actual
    }
}
