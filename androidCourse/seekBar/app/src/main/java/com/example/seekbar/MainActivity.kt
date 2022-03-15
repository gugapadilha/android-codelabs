package com.example.seekbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) { //quando o valor mudar
                valorAtual.text = "" + progress //mostra o progresso da barra
            }

            override fun onStartTrackingTouch(seekBar1: SeekBar?) { //quando eu arrastar

                Toast.makeText(applicationContext, "Começou em: " + seekBar.progress, Toast.LENGTH_LONG).show()
            }

            override fun onStopTrackingTouch(seekBar1: SeekBar?) { //quando eu parar

                Toast.makeText(applicationContext, "Terminou em: "+ seekBar.progress, Toast.LENGTH_LONG).show()
            }

        })
        button.setOnClickListener {
            Toast.makeText(applicationContext, "Valor final? "+ seekBar.progress, Toast.LENGTH_LONG).show()
        }

    }
}