package com.pmdm.recursos;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import android.graphics.Typeface;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        LinearLayout layout2 = findViewById(R.id.Linear2);
        TextView textView2 = findViewById(R.id.Text2);
        ImageView imageView2 = findViewById(R.id.Image2);

        //Cambiar color de fondo
        //layout2.setBackgroundColor(Color.parseColor("#5E7EF1"));
        layout2.setBackgroundColor(ContextCompat.getColor(this,R.color.custom_color));

        //Cambiar fuente
        Typeface typeface = ResourcesCompat.getFont(this,R.font.rubikwetpaint);
        textView2.setTypeface(typeface);

        //Cambiar la imagen
        imageView2.setImageResource(R.drawable.saturno);
    }
}