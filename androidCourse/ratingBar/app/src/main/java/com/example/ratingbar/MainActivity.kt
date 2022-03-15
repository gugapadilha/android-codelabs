package com.example.ratingbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ratingBar.setOnRatingBarChangeListener { ratingBar, rating, fromUser ->
            rating
            valorSelecionado.text = "" + rating
        }


        button.setOnClickListener {
            Toast.makeText(
                applicationContext,
                "Valor selecionado = " + ratingBar.rating,
                Toast.LENGTH_LONG
            ).show()
        }
    }
}