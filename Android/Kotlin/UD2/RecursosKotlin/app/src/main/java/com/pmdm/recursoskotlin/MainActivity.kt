package com.pmdm.recursoskotlin

import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val layout2 : LinearLayout = findViewById<LinearLayout>(R.id.Linear2)
        val textView2 : TextView = findViewById<TextView>(R.id.Text2)
        val imageView2 : ImageView = findViewById<ImageView>(R.id.Image2)

        layout2.setBackgroundColor(ContextCompat.getColor(this,R.color.custom_color))

        val typeface = ResourcesCompat.getFont(this,R.font.rubikwetpaint)
        textView2.setTypeface(typeface)

        imageView2.setImageResource(R.drawable.saturno)
    }
}