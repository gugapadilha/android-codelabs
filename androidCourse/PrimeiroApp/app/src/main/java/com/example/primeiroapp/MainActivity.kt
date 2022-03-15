package com.example.primeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //todo codigo vai aqui em baixo, pois o XML precisa estar aberto

        botao.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {

                var textoDigitado = nome.text.toString()

                Toast.makeText(applicationContext, textoDigitado, Toast.LENGTH_LONG).show()
            }

        })

    }
}