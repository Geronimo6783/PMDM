package com.pmdm.ud02ej006j;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.os.AsyncTask;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
//Importamos Glide
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

//Importamos Picasso
import com.squareup.picasso.Picasso;

import java.io.InputStream;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Comportamiento Boton 1
        Button btn = findViewById(R.id.button1);
        final ImageView imgVi = findViewById(R.id.imagen1);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Iniciar la tarea en segundo plano para descargar la imagen
                new DownloadImageTask(imgVi).execute("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjgifeYpeiAXU_d7MgXj8jKko-9TTYALn_rKxd2OmVLV3TjO7vBxvqYrKycgXb4RDDB7h_jqTrwQ4Ha1GHquPMQoG5BQzXhVEQ4eL_mqvkhKH6ZJpdMoS_60Z4UIddqXHJ8hk6JafAX644/s400/sachin_tendulkar_double_century.jpg");
            }
        });

        //Comportamiento Boton 2
        Button btn2 = findViewById(R.id.button2);
        final ImageView imgVi2 = findViewById(R.id.imagen2);
        String imageUrl = "https://picsum.photos/200/300";

        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Usa Glide para cargar la imagen desde la URL
                Glide.with(MainActivity.this)
                        .load(imageUrl)
                        .apply(new RequestOptions()
                                        .placeholder(R.drawable.ic_launcher_foreground) // Imagen de marcador de posición
                                        .error(R.drawable.ic_launcher_background) // Imagen de error en caso de fallo de carga
                                //.skipMemoryCache(true) // No usar la caché de memoria
                                //.diskCacheStrategy(DiskCacheStrategy.NONE) // No usar la caché de disco
                        )
                        .into(imgVi2);
            }
        });

        // Comportamiento del Botón 3
        Button btn3 = (Button) findViewById(R.id.button3);
        final ImageView imgVi3 = (ImageView) findViewById(R.id.imagen3);
        String imageUrl3 = "https://picsum.photos/200/300";

        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Usa Picasso para cargar la imagen desde la URL
                Picasso.get().load(imageUrl3).into(imgVi3);
            }
        });

    }


    // Clase AsyncTask para descargar la imagen en segundo plano
    private static class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
        ImageView bmImage;

        public DownloadImageTask(ImageView bmImage) {
            this.bmImage = bmImage;
        }

        protected Bitmap doInBackground(String... urls) {
            String urldisplay = urls[0];
            Bitmap mIcon11 = null;
            try {
                InputStream in = new URL(urldisplay).openStream();
                mIcon11 = BitmapFactory.decodeStream(in);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return mIcon11;
        }

        protected void onPostExecute(Bitmap result) {
            bmImage.setImageBitmap(result);
        }
    }
}