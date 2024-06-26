package com.cdp.artusodehesapiovano

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ImageEj2Ko : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.image_ej2_ko)

        //boton para volver
        val buttonBack: Button = findViewById(R.id.buttonBack)
        buttonBack.setOnClickListener {
            startActivity(Intent(this, Ejemplo2::class.java))
        }
    }
}