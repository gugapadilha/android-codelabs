package com.example.radiobuttonradiogroupd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            if (radioGroup.checkedRadioButtonId != null){ //checa o botao do grupo que foi clicar
                var radioSelecionado = radioButton
                radioSelecionado = findViewById(radioGroup.checkedRadioButtonId)
                Toast.makeText(applicationContext, "Radio clicado: " + radioSelecionado.text, Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(applicationContext, "Nenhuma opção selecionada: ",  Toast.LENGTH_LONG).show()
            }
        }

        radioGroup.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener {
            override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
                var radioSelecionado = radioButton
                radioSelecionado = findViewById(radioGroup.checkedRadioButtonId)
                Toast.makeText(applicationContext, "Radio selecionado: " + radioSelecionado.text, Toast.LENGTH_LONG).show()
            }

        })
    }
}