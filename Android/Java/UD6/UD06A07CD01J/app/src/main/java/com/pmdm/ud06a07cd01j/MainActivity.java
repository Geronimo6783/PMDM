package com.pmdm.ud06a07cd01j;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Infla el menú XML en la barra de acción
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu); // Reemplaza "main_menu" con el nombre de tu archivo de menú
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Maneja las acciones del menú
        int id = item.getItemId();
        if (id == R.id.edit_action) {
            // Acción para el botón de editar
            Toast.makeText(this, "Edit action clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.create_pdf_action) {
            // Acción para crear PDF
            Toast.makeText(this, "Create PDF action clicked", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        if (menu.getClass().getSimpleName().equals("MenuBuilder")) {
            try {
                Method m = menu.getClass().getDeclaredMethod("setOptionalIconsVisible", boolean.class);
                m.setAccessible(true);
                m.invoke(menu, true);


                // Cambiar el fondo de las letras del menú
                for (int i = 0; i < menu.size(); i++) {
                    MenuItem item = menu.getItem(i);
                    SpannableString title = new SpannableString(item.getTitle());
                    title.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this, R.color.pale_peach)), 0, title.length(), 0);
                    item.setTitle(title);

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return super.onPrepareOptionsMenu(menu);
    }

}