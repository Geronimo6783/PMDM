package com.pmdm.planetas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import android.util.Log;

// Clase que extiende RecyclerView.Adapter y maneja la vista de cada elemento en la lista
public class PlanetAdapter extends RecyclerView.Adapter<PlanetAdapter.PlanetViewHolder> {

    private List<Planet> planetList; // Lista de objetos de tipo Planet

    // Constructor que recibe la lista de planetas
    public PlanetAdapter(List<Planet> planetList) {
        this.planetList = planetList;
    }

    // Método que crea nuevas instancias de PlanetViewHolder (se invoca cuando se necesita una nueva celda en la lista)
    @NonNull
    @Override
    public PlanetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Se infla el diseño del elemento de la lista desde su archivo XML (item_planet.xml)
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_planet, parent, false);
        return new PlanetViewHolder(view); // Se retorna una nueva instancia de PlanetViewHolder
    }

    // Método que asigna datos a las vistas de una celda (se invoca cuando se muestra una celda en la lista)
    @Override
    public void onBindViewHolder(@NonNull PlanetViewHolder holder, int position) {
        Planet planet = planetList.get(position); // Se obtiene el objeto Planet en la posición actual
        // Se asignan los datos del planeta a las vistas en la celda
        holder.textViewName.setText(planet.getName());
        holder.textViewRadius.setText(String.valueOf(planet.getRadius()));
        holder.textViewDistance.setText(String.valueOf(planet.getDistanceToSun()));
    }

    // Método que devuelve la cantidad de elementos en la lista
    @Override
    public int getItemCount() {
        return planetList.size();
    }

    // Clase estática que representa la vista de cada elemento en la lista
    public static class PlanetViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName, textViewRadius, textViewDistance; // Vistas para mostrar los datos del planeta

        // Constructor que recibe la vista de un elemento en la lista
        public PlanetViewHolder(View itemView) {
            super(itemView);
            // Se asocian las vistas con los elementos del diseño de la celda mediante sus IDs
            textViewName = itemView.findViewById(R.id.textViewName);
            textViewRadius = itemView.findViewById(R.id.textViewRadius);
            textViewDistance = itemView.findViewById(R.id.textViewDistance);
        }
    }
}