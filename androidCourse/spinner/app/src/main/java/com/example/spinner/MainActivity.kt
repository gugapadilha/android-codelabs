package com.example.spinner

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val estados = arrayOf("Rio Grande do Sul", "Rio de Janeiro", "São Paulo", "Minas Gerais")
        spinner.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, estados)

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                textView.text = estados[position]
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }


        }
        button.setOnClickListener {
            val posicaoSelecionada = spinner.selectedItemPosition //pegando a posicao do array
            Toast.makeText(applicationContext, estados[posicaoSelecionada], Toast.LENGTH_LONG)
                .show()
        }
    }
}