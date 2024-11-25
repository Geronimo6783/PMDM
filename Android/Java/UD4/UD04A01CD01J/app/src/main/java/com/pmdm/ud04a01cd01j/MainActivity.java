package com.pmdm.ud04a01cd01j;

import androidx.appcompat.app.AppCompatActivity;
import android.content.res.Configuration;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int orientation = getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.layout_land); // Carga el diseño para landscape
        } else {
            setContentView(R.layout.activity_main); // Carga el diseño para portrait
        }
    }
}