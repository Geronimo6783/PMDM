package com.pmdm.ud03ej012_send;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mandarTexto(View view){
        TextInputEditText textoIntroducido = findViewById(R.id.TextoIntroducido);
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_TEXT, textoIntroducido.getText().toString());
        startActivity(i);
    }

    public void llamar(View view){
        Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:678989876"));
        startActivity(i);
    }
}