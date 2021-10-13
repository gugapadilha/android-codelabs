package com.example.togglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toggleButton.setOnCheckedChangeListener{ buttonView, isChecked -> isChecked

            textView.text = verificaInterruptor(isChecked) //o textView recebe a funcao p verificar o interruptor
        }

        button.setOnClickListener {
            Toast.makeText(applicationContext, verificaInterruptor(toggleButton.isChecked), Toast.LENGTH_LONG).show()
        }
    }

    private fun verificaInterruptor(isChecked: Boolean): String {
        var textoExibir = ""
        if (isChecked) {
            textoExibir = "Ligado"
        } else {
            textoExibir = "Desligado"
        }
        return textoExibir
    }
}