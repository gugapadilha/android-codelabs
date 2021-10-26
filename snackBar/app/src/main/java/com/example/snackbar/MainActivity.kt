package com.example.snackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val snackBar: Snackbar
            snackBar = Snackbar.make(button, "Ação realizada com sucesso", Snackbar.LENGTH_LONG)
            snackBar.setAction("Desfazer", View.OnClickListener {
                Toast.makeText(applicationContext, "Desfeito", Toast.LENGTH_SHORT).show()
            })
            snackBar.show()
        }
    }
}