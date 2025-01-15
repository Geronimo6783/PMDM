package com.pmdm.ud06a01cd01j.FourthActivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.pmdm.ud06a01cd01j.SecondActivity.Tarea;

import java.util.List;

public class TareaArrayAdapter2 extends ArrayAdapter<Tarea> {

    public TareaArrayAdapter2(Context context, List<Tarea> tareas) {
        super(context, android.R.layout.two_line_list_item, tareas);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Usar el convertView si está disponible, o inflar un nuevo diseño
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(android.R.layout.two_line_list_item, parent, false);
        }

        // Obtener referencias a los TextView dentro del diseño
        TextView text1 = convertView.findViewById(android.R.id.text1);
        TextView text2 = convertView.findViewById(android.R.id.text2);

        // Obtener la tarea actual
        Tarea tarea = getItem(position);

        // Configurar los datos en los TextView
        if (tarea != null) {
            text1.setText(tarea.getNombre()); // Primera línea
            text2.setText(tarea.getHora());   // Segunda línea
        }

        return convertView;
    }
}
