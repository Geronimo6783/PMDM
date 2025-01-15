package com.pmdm.ud06a01cd01j.ThirdActivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.pmdm.ud06a01cd01j.R;

import java.util.List;

/**
 * CustomAdapter es una clase que extiende ArrayAdapter<String>.
 * Su función principal es personalizar la vista de cada elemento de un ListView.
 * En este caso, cada elemento tendrá dos líneas de texto (dos TextViews).
 */
public class CustomAdapter extends ArrayAdapter<String> {

    /**
     * Constructor del adaptador personalizado.
     *
     * @param context Contexto de la aplicación o actividad.
     * @param objects Lista de cadenas (datos) que serán mostrados en el ListView.
     */
    public CustomAdapter(Context context, List<String> objects) {
        // Se llama al constructor de la clase base (ArrayAdapter).
        // El segundo parámetro (resource) es 0 porque no estamos usando un recurso de diseño estándar.
        super(context, 0, objects);
    }

    /**
     * Método que proporciona una vista personalizada para cada elemento en el ListView.
     *
     * @param position    Posición del elemento en la lista de datos.
     * @param convertView Vista reciclada que puede ser reutilizada (si no es nula).
     * @param parent      Vista padre a la que pertenece el elemento (generalmente el ListView).
     * @return La vista personalizada para el elemento en la posición dada.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // 1. Verificar si `convertView` es nulo.
        // Si es nulo, significa que no hay una vista reciclada disponible.
        if (convertView == null) {
            // Inflamos una nueva vista desde el diseño XML definido (item_two_lines.xml).
            // LayoutInflater se utiliza para convertir un archivo XML en una vista en tiempo de ejecución.
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_two_lines, parent, false);
        }

        // 2. Obtener el dato correspondiente a esta posición.
        // `getItem(position)` devuelve el elemento de datos asociado con la posición actual.
        String tarea = getItem(position);

        // 3. Vincular las vistas del diseño XML con variables en el código.
        // Encontramos los TextViews en el diseño `item_two_lines`.
        TextView line1 = convertView.findViewById(R.id.line1);
        TextView line2 = convertView.findViewById(R.id.line2);

        // 4. Establecer los valores en los TextViews.
        // `line1` muestra el texto principal (tarea).
        line1.setText(tarea);

        // `line2` muestra una descripción adicional, personalizada dinámicamente.
        line2.setText("Descripción de " + tarea);

        // 5. Devolver la vista configurada.
        return convertView;
    }
}
