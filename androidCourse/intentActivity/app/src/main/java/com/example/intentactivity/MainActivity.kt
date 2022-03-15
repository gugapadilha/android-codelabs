package com.example.intentactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {

            val intent = Intent(applicationContext, tela2Activity::class.java)
            startActivity(intent)
            val params = Bundle()
            val textoDigitado = editTextTextPersonName.text.toString()
            params.putString("texto", textoDigitado)
            intent.putExtras(params)
            startActivity(intent)
        }
    }
}