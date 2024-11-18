package com.pmdm.ud02ej002j;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editText1, editText2;
    private Button sumButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializar las vistas
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        sumButton = findViewById(R.id.sumButton);
        resultTextView = findViewById(R.id.resultTextView);

        // Configurar el listener del botón
        sumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = 0;
                int num2 = 0;

                // Convertir el texto de los EditText a números, o usar 0 si hay algún error
                try {
                    num1 = Integer.parseInt(editText1.getText().toString());
                } catch (NumberFormatException e) {
                    num1 = 0;
                }

                try {
                    num2 = Integer.parseInt(editText2.getText().toString());
                } catch (NumberFormatException e) {
                    num2 = 0;
                }

                // Calcular la suma
                int sum = num1 + num2;

                // Mostrar el resultado
                resultTextView.setText("Resultado: " + sum);
            }
        });
    }
}
