package com.example.listview

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var jogos = ArrayList<Jogo>()
        jogos.add(Jogo("God of War", "PS4"))
        jogos.add(Jogo("Halo", "XONE"))

        var adapter : ListaAdapter = ListaAdapter(applicationContext, jogos)
        lista.adapter = adapter

        lista.setOnItemClickListener {
            parent, view, position, id ->
            Toast.makeText(applicationContext, "Jogo: "+ jogos.get(position).name , Toast.LENGTH_LONG).show()
        }

        lista.setOnItemLongClickListener {
            parent, view, position, id ->
            Toast.makeText(applicationContext, "Jogo do LONG CLICK: "+ jogos.get(position).name , Toast.LENGTH_LONG).show()
            exibirDialog()
            true
        }
    }

    fun exibirDialog() {
        var dialog: Dialog = Dialog(this)
        dialog.setContentView(R.layout.popup)
        dialog.setCancelable(true)
        dialog.show()
    }
}