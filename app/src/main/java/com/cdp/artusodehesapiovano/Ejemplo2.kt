package com.cdp.artusodehesapiovano

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.Toast
import android.widget.ToggleButton
import android.widget.Button
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

class Ejemplo2 : AppCompatActivity() {
    private lateinit var seleccionDireccion: CheckBox

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejemplo2)

        val buttonBack: Button = findViewById(R.id.buttonBack2)
        buttonBack.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        val buttonKotlin: Button = findViewById(R.id.buttonKotlin)
        buttonKotlin.setOnClickListener {
            startActivity(Intent(this, ImageEj2Ko::class.java))
        }

        val buttonXml: Button = findViewById(R.id.buttonXml)
        buttonXml.setOnClickListener {
            startActivity(Intent(this, ImageEj2Xm::class.java))
        }




        seleccionDireccion = findViewById(R.id.seleccion_direccion_envio)

        val toggle: ToggleButton = findViewById(R.id.toggleButton)
        toggle.setOnCheckedChangeListener { _, isChecked ->
            Toast.makeText(this, if (isChecked) "Geek Mode ON" else "Geek Mode OFF", Toast.LENGTH_SHORT).show()
        }

    }

    fun loguearCheckbox(v: View) {
        val estado = if (seleccionDireccion.isChecked) "Marcado" else "No Marcado"
        Toast.makeText(this, "Estado: $estado", Toast.LENGTH_LONG).show() }
}