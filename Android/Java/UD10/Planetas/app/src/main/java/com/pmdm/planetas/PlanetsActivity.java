package com.pmdm.planetas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.util.Log;
import java.util.List;

public class PlanetsActivity extends AppCompatActivity {

    private RecyclerView recyclerViewPlanets;
    private DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planets);

        recyclerViewPlanets = findViewById(R.id.recyclerViewPlanets);
        recyclerViewPlanets.setLayoutManager(new LinearLayoutManager(this));

        databaseHelper = new DatabaseHelper(this);
        List<Planet> planets = databaseHelper.getAllPlanets();

        // Añadir mensajes de registro (logs) aquí
        Log.d("PlanetsActivity", "Cantidad de planetas recuperados: " + planets.size());

        for (Planet planet : planets) {
            Log.d("PlanetsLog", "Name: " + planet.getName());
            Log.d("PlanetsLog", "Radius: " + planet.getRadius());
            Log.d("PlanetsLog", "Distance to Sun: " + planet.getDistanceToSun());
            Log.d("PlanetsLog", "----------------------");
        }

        // Agrega un planeta "falso" o "hardcoded" para probar
        //planets.add(new Planet("Planeta Falso", 5000, 10));

        PlanetAdapter planetAdapter = new PlanetAdapter(planets);
        recyclerViewPlanets.setAdapter(planetAdapter);
    }
}