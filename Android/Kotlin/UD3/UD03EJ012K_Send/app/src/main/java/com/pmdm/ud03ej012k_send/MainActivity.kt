package com.pmdm.ud03ej012k_send

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun mandarTexto(view: View?){
        var textoIntroducido: TextInputEditText = findViewById(R.id.TextoIntroducido)
        var i: Intent = Intent(Intent.ACTION_EDIT)
        i.setType("text/plain")
        i.putExtra(Intent.EXTRA_TEXT, textoIntroducido.getText().toString())
        startActivity(i)
    }

    fun llamar(view: View?){
        var i: Intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:678989876"))
        startActivity(i)
    }
}