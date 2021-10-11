package com.example.checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkBox.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {

                var exibirTexto = criarTexto(isChecked) //chamando a fun criarTexto

                Toast.makeText(applicationContext, exibirTexto, Toast.LENGTH_LONG).show()
                texto.text = exibirTexto //meu textView vai exibir a mesma coisa que o isChecked
            }

        })

        button.setOnClickListener {
            var exibirTexto = criarTexto(checkBox.isChecked)
            Toast.makeText(applicationContext, exibirTexto, Toast.LENGTH_LONG).show() //vai exiir "Marcado" ou "Desmarcado" novamente.
        }

    }
    private fun criarTexto(isChecked: Boolean): String {
        var exibirTexto = ""
        if (isChecked == true) {
            exibirTexto = "Marcado"
        } else {
            exibirTexto = "Desmarcado"
        }
        return exibirTexto
    }

}