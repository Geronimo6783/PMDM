package com.pmdm.ud02ej002j_b;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.pmdm.ud02ej002j_b.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.sumButton.setOnClickListener(v -> {
            int num1 = 0;
            int num2 = 0;

            // Convertir el texto de los EditText a números, o usar 0 si hay algún error
            try {
                num1 = Integer.parseInt(binding.editText1.getText().toString());
            } catch (NumberFormatException e) {
                num1 = 0;
            }

            try {
                num2 = Integer.parseInt(binding.editText2.getText().toString());
            } catch (NumberFormatException e) {
                num2 = 0;
            }

            int sum = num1 + num2;
            binding.resultTextView.setText("Resultado: " + sum);
        });
    }
}