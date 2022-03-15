package com.example.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class JogoAdapter(val context: Context, val itens: ArrayList<Jogo>) : RecyclerView.Adapter<JogoViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JogoViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.linha_de_jogo, parent, false)
        val holder = JogoViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: JogoViewHolder, position: Int) {

        val jogo = itens.get(position)
        holder.nome.text = jogo.nome
        holder.plataforma.text = jogo.plataforma
        holder.nome.setOnClickListener {
            Toast.makeText(context, "Clicou em "+ jogo.nome, Toast.LENGTH_LONG).show()
        }
    }

    override fun getItemCount(): Int {

        return itens.size
    }

}