package com.pmdm.planetas;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

// La clase principal que extiende de AppCompatActivity
public class MainActivity extends AppCompatActivity {

    // Declaración de variables
    EditText editTextName, editTextRadius, editTextDistance;
    Button buttonAddPlanet;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Establecer el diseño de la actividad

        // Vinculación de variables con elementos de diseño
        editTextName = findViewById(R.id.editTextName);
        editTextRadius = findViewById(R.id.editTextRadius);
        editTextDistance = findViewById(R.id.editTextDistance);
        buttonAddPlanet = findViewById(R.id.buttonAddPlanet);

        // Inicialización de la instancia de DatabaseHelper
        databaseHelper = new DatabaseHelper(this);

        // Acción cuando se hace clic en el botón "Añadir Planeta"
        buttonAddPlanet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPlanetToDatabase(); // Método para agregar un planeta a la base de datos
            }
        });

        // Botón para mostrar la lista de planetas existentes
        Button buttonShowPlanets = findViewById(R.id.buttonShowPlanets);
        buttonShowPlanets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Creación de un intent para abrir la actividad PlanetsActivity
                Intent intent = new Intent(MainActivity.this, PlanetsActivity.class);
                startActivity(intent); // Iniciar la actividad de los planetas
            }
        });
    }

    // Método para agregar un planeta a la base de datos
    private void addPlanetToDatabase() {
        // Obtener el texto ingresado en los campos de entrada
        String name = editTextName.getText().toString();
        String radiusText = editTextRadius.getText().toString();
        String distanceText = editTextDistance.getText().toString();

        // Verificar que los campos no estén vacíos
        if (!name.isEmpty() && !radiusText.isEmpty() && !distanceText.isEmpty()) {
            // Convertir el texto del radio y la distancia a números
            double radius = Double.parseDouble(radiusText);
            double distance = Double.parseDouble(distanceText);

            // Crear un nuevo objeto de tipo Planet con los datos ingresados
            Planet newPlanet = new Planet(name, radius, distance);

            // Agregar el planeta a la base de datos
            boolean inserted = databaseHelper.addPlanet(newPlanet);

            // Mostrar un mensaje según el resultado de la inserción en la base de datos
            if (inserted) {
                Toast.makeText(this, "Planeta añadido correctamente", Toast.LENGTH_SHORT).show();
                // Limpiar los campos después de agregar el planeta
                editTextName.getText().clear();
                editTextRadius.getText().clear();
                editTextDistance.getText().clear();
            } else {
                Toast.makeText(this, "Error al añadir el planeta", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show();
        }
    }
}

