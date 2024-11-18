package com.pmdm.ud03ej002j;

import android.os.Bundle;
import android.widget.Button;
import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.Button01);

        int colorRojo = ContextCompat.getColor(this, R.color.red);

        button.setBackgroundColor(Color.BLUE);
        button.setBackgroundColor(getResources().getColor(R.color.yellow));

        if(button != null){
            button.setBackgroundColor(colorRojo);
        }
    }
}