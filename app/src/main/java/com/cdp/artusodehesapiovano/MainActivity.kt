package com.cdp.artusodehesapiovano

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class ActividadPrincipal : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actividad_principal)

        val contenedor: RadioGroup = findViewById(R.id.grupo_dias)
        val opcionI2: RadioButton = contenedor.getChildAt(2) as RadioButton
        opcionI2.isChecked = true
    }
}
