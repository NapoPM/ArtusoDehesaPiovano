package com.cdp.artusodehesapiovano

import android.annotation.SuppressLint
import android.graphics.Typeface
import android.os.Bundle
import android.widget.TextView
import androidx.annotation.ColorRes
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.google.android.material.switchmaterial.SwitchMaterial

class MainActivity : AppCompatActivity() {
    private lateinit var text: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actividad_principal)

        text = findViewById(R.id.textView)

        setupItalicSwitch()

        setupHighlightedSwitch()
    }

    private fun setupItalicSwitch() {
        val italicSwitch: SwitchMaterial = findViewById(R.id.switch_italic_format)

        italicSwitch.setOnCheckedChangeListener { _, isChecked ->
            val typeface = if (isChecked) Typeface.ITALIC else Typeface.NORMAL
            text.setTypeface(null, typeface)
        }
    }

    private fun setupHighlightedSwitch() {
        val colorSwitch: SwitchMaterial = findViewById(R.id.switch_highlighted)

        colorSwitch.setOnCheckedChangeListener { _, isChecked ->
            val colorRes = if (isChecked) R.color.green_500 else R.color.black
            text.setTextColor(getColorValue(colorRes))
        }
    }

    private fun getColorValue(@ColorRes colorRes: Int): Int {
        return ContextCompat.getColor(this, colorRes)
    }
}
