package com.example.aswitch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        switch1.setOnCheckedChangeListener() { //tem que ser checked
            button, isChecked -> isChecked
            var ligadoOuDesligado = ""
            if (isChecked) {
                ligadoOuDesligado = "Ligado"
            }else {
                ligadoOuDesligado = "Desligado"
            }
            statusSwitch.text = ligadoOuDesligado //sempre especificar o tipo de texto
        }

        button.setOnClickListener( object : View.OnClickListener {
            override fun onClick(v: View?) {
                var ligadoOuDesligado = ""
                if (switch1.isChecked) {
                    ligadoOuDesligado = "Ligado"
                }else {
                    ligadoOuDesligado = "Desligado"
                }

                Toast.makeText(applicationContext, "Switch está: " + ligadoOuDesligado, Toast.LENGTH_LONG).show()
            }

        })


    }
}