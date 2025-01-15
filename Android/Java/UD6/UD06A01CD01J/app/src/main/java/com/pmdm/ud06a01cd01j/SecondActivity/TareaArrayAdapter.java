package com.pmdm.ud06a01cd01j.SecondActivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

/**
 * Clase genérica TareaArrayAdapter<T> que extiende ArrayAdapter<T>.
 * Es un adaptador personalizado que permite manejar y mostrar elementos en un ListView.
 * En este caso, cada elemento tiene dos líneas de texto, utilizando el diseño predefinido de Android `two_line_list_item`.
 *
 * @param <T> Tipo genérico de los elementos en el adaptador (puede ser cualquier objeto).
 */

public class TareaArrayAdapter<T> extends ArrayAdapter<T> {

    /**
     * Constructor del adaptador.
     *
     * @param context Contexto de la actividad o aplicación donde se usará el adaptador.
     * @param objects Lista de objetos que serán gestionados y mostrados en el ListView.
     */
    public TareaArrayAdapter(Context context, List<T> objects) {
        // Se llama al constructor de la clase base (ArrayAdapter).
        // El segundo parámetro (resource) es 0 porque usamos un diseño personalizado en `getView`.
        super(context, 0, objects);
    }

    /**
     * Método que proporciona una vista personalizada para cada elemento en el ListView.
     *
     * @param position    Posición del elemento en la lista de datos.
     * @param convertView Vista reciclada (si existe) que puede ser reutilizada.
     * @param parent      Vista padre (generalmente el ListView) que contiene los elementos.
     * @return La vista personalizada para el elemento en la posición dada.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        // 1. Obtener una instancia del LayoutInflater.
        // El LayoutInflater es responsable de convertir un archivo XML en una vista.
        LayoutInflater inflater = (LayoutInflater)getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // 2. Guardar la referencia de la vista para la fila.
        //Salvando la referencia del View de la fila
        View listItemView = convertView;

        // 3. Comprobar si la vista reciclada (`convertView`) es nula.
        //Comprobando si el View no existe
        if (null == convertView) {
            // Si `convertView` es nulo, inflar una nueva vista utilizando el diseño predefinido de Android.
            // En este caso, se utiliza `two_line_list_item`, que contiene dos TextViews:
            // - `android.R.id.text1` para la línea principal.
            // - `android.R.id.text2` para la línea secundaria.
            //Si no existe, entonces inflarlo con two_line_list_item.xml
            listItemView = inflater.inflate(
                    android.R.layout.two_line_list_item,
                    parent,
                    false);
        }

        // 4. Obtener referencias a los TextViews dentro de la vista inflada.
        //Obteniendo instancias de los text views
        TextView titulo = (TextView)listItemView.findViewById(android.R.id.text1);
        TextView subtitulo = (TextView)listItemView.findViewById(android.R.id.text2);

        // 5. Obtener el elemento actual de la lista basado en la posición.
        // Se utiliza `getItem(position)` para acceder al objeto en la posición actual.
        //Obteniendo instancia de la Tarea en la posición actual
        T item = (T)getItem(position);

        // 6. Dividir el contenido del elemento en dos partes: título y subtítulo.
        // Suponemos que el objeto se puede convertir a una cadena (`item.toString()`).
        // La cadena está en un formato como "Título,Subtítulo", donde las partes están separadas por una coma.
        //Dividir la cadena en Nombre y Hora
        String cadenaBruta;      // La cadena completa del objeto.
        String subCadenas[];     // Array que contendrá las dos partes (Título y Subtítulo).
        String delimitador = ","; // El delimitador para dividir la cadena.


        // Obtener la representación en cadena del objeto y dividirla en dos partes.
        cadenaBruta = item.toString();        // Convertimos el objeto a cadena.
        subCadenas = cadenaBruta.split(delimitador, 2); // Dividimos la cadena en dos partes.

        // 7. Configurar los TextViews con las partes correspondientes.
        titulo.setText(subCadenas[0]);        // Establecer el texto de la línea principal.
        subtitulo.setText(subCadenas[1]);     // Establecer el texto de la línea secundaria.

        // 8. Devolver la vista personalizada para el ListView.
        //Devolver al ListView la fila creada
        return listItemView;
    }
}
