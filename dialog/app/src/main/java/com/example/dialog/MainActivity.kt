package com.example.dialog

import android.app.Dialog
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.cadastro.*

class MainActivity : AppCompatActivity() {

    lateinit var dialog: Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{
            displayDialog()
        }
    }

    fun displayDialog() {
        dialog = Dialog(this)
        dialog.setContentView(R.layout.cadastro)
        dialog.setCancelable(true)
        dialog.button2.setOnClickListener{
            Toast.makeText(applicationContext, dialog.editText1.text, Toast.LENGTH_LONG).show()
            dialog.dismiss()
        }


        dialog.button3.setOnClickListener {
            dialog.dismiss()
        }

        dialog.show()
    }
}