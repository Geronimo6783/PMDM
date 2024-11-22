package com.pmdm.ud03a08cd01;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }



    // Método para compartir contenido

    public void compartir(View view) {

        // Crea una intención para compartir texto

        Intent intent = new Intent(Intent.ACTION_SEND);

        intent.setType("text/plain");

        intent.putExtra(Intent.EXTRA_TEXT,

                "Mira el sitio que he encontrado http://www.google.com/");

        // Inicia la actividad de compartir

        startActivity(intent);

    }



    // Método para abrir una página web

    public void abrirPagina(View view) {

        // Crea una intención para abrir una página web

        Intent intent = new Intent(Intent.ACTION_VIEW,

                Uri.parse("http://www.google.com/"));

        // Inicia la actividad para abrir la página web

        startActivity(intent);

    }



    // Método para llamar a un número de teléfono

    public void llamarTelefono(View view) {

        // Crea una intención para llamar a un número de teléfono

        Intent intent = new Intent(Intent.ACTION_DIAL,

                Uri.parse("tel:962849347"));

        // Inicia la actividad para realizar la llamada

        startActivity(intent);

    }



    // Método para ver un mapa con ubicación

    public void verMapa(View view) {

        // Crea una intención para ver un mapa con una ubicación específica

        Intent intent = new Intent(Intent.ACTION_VIEW,

                Uri.parse("geo:38.995656,-0.166093?z=18"));

        // Inicia la actividad para mostrar el mapa

        startActivity(intent);

    }



    // Método para tomar una foto

    public void tomarFoto(View view) {

        // Crea una intención para abrir la cámara y tomar una foto

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

        // Inicia la actividad de la cámara

        startActivity(intent);

    }



    // Método para enviar un correo electrónico

    public void mandarCorreo(View view) {

        // Crea una intención para enviar un correo electrónico

        Intent intent = new Intent(Intent.ACTION_SEND);

        intent.setType("text/plain");

        intent.putExtra(Intent.EXTRA_SUBJECT, "asunto");

        intent.putExtra(Intent.EXTRA_TEXT, "texto del correo");

        intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"correo@ejemplo.com"});

        // Inicia la actividad para enviar el correo

        startActivity(intent);

    }



    // Método para abrir Street View

    public void streetview(View view) {

        // Crea una intención para abrir Google Street View en una ubicación específica

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(

                "google.streetview:cbll=38.996766,-0.1652696&cbp=0,250,0,0,0"));

        //cbll=latitud,longitud&cbp=0,azimut,0,zoom,altura

        // Inicia la actividad para mostrar Street View

        startActivity(intent);

    }

}