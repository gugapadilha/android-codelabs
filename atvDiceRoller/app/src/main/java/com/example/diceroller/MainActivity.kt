package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rollButton.setOnClickListener {
            rollDice()
            rollDice2()
        }
    }

    private fun rollDice2(){
        val dice2 = Dice(6)
        val diceRoll2 = dice2.roll()

        val result2TextView =  textView2
        result2TextView.text = diceRoll2.toString()
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()

        val reusltTextView = textView
        reusltTextView.text = diceRoll.toString()
    }

    class Dice(private val numSides: Int) {
        fun roll(): Int {
            return (1..numSides).random()
        }
    }
}