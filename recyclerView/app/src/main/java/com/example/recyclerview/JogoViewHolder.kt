package com.example.recyclerview

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class JogoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val nome: TextView = itemView!!.findViewById(R.id.nome)
    val plataforma: TextView = itemView!!.findViewById(R.id.plataforma)
}

