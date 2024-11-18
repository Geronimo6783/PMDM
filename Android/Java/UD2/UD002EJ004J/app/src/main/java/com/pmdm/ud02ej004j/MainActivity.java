package com.pmdm.ud02ej004j;

import android.content.Context;
import android.content.res.Configuration;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(updateBaseContextLocale(newBase, Locale.getDefault().getLanguage()));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);
        TextView textView2 = findViewById(R.id.textView2);
        Button buttonSpanish = findViewById(R.id.buttonSpanish);
        Button buttonEnglish = findViewById(R.id.buttonEnglish);
        Button buttonFrench = findViewById(R.id.buttonFrench);
        Button buttonItalian = findViewById(R.id.buttonItalian);

        // Mostrar el idioma del sistema actual en textView
        String systemLanguage = getSystemLanguage();
        textView.setText(getString(R.string.language_prompt, systemLanguage));

        // Mostrar el idioma de la aplicación actual en textView2
        String localeLanguage = Locale.getDefault().getDisplayLanguage();
        textView2.setText(getString(R.string.language_prompt_2, localeLanguage));

        buttonSpanish.setOnClickListener(v -> updateLocale("es"));
        buttonEnglish.setOnClickListener(v -> updateLocale("en"));
        buttonFrench.setOnClickListener(v -> updateLocale("fr"));
        buttonItalian.setOnClickListener(v -> updateLocale("it"));
    }

    private void updateLocale(String languageCode) {
        Locale locale = new Locale(languageCode);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.setLocale(locale);

        // Aplicar la nueva configuración al contexto de la aplicación
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());

        // Reinicia la actividad para aplicar los cambios
        recreate();
    }

    @Override
    protected void onResume() {
        super.onResume();
        updateTextViewWithCurrentLocale();
    }

    private void updateTextViewWithCurrentLocale() {
        // Obtener el idioma del sistema actual
        String systemLanguage = getSystemLanguage();
        TextView textView = findViewById(R.id.textView);
        TextView textView2 = findViewById(R.id.textView2);

        // Mostrar el idioma del sistema actual en textView
        String formattedTextSystem = getString(R.string.language_prompt, systemLanguage);
        textView.setText(formattedTextSystem);

        // Mostrar el idioma de la aplicación actual en textView2
        String currentLocale = Locale.getDefault().getDisplayLanguage();
        String formattedTextApp = getString(R.string.language_prompt_2, currentLocale);
        textView2.setText(formattedTextApp);

        // Actualizar los textos de los botones
        Button buttonSpanish = findViewById(R.id.buttonSpanish);
        Button buttonEnglish = findViewById(R.id.buttonEnglish);
        Button buttonFrench = findViewById(R.id.buttonFrench);
        Button buttonItalian = findViewById(R.id.buttonItalian);

        buttonSpanish.setText(getString(R.string.button_spanish));
        buttonEnglish.setText(getString(R.string.button_english));
        buttonFrench.setText(getString(R.string.button_french));
        buttonItalian.setText(getString(R.string.button_italian));
    }

    private Context updateBaseContextLocale(Context context, String language) {
        Locale locale = new Locale(language);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.setLocale(locale);
        return context.createConfigurationContext(config);
    }

    private String getSystemLanguage() {
        return Resources.getSystem().getConfiguration().getLocales().get(0).getDisplayLanguage();
    }
}