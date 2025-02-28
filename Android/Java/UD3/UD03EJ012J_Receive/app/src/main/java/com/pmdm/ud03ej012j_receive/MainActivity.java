package com.pmdm.ud03ej012j_receive;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle extras = getIntent().getExtras();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView vistaTexto = findViewById(R.id.TextViewMayusculas);
        vistaTexto.setText(extras.getString(Intent.EXTRA_TEXT).toUpperCase());
    }

    public void salir(View view){
        finish();
    }
}