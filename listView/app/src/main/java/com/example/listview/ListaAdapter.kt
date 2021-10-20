package com.example.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListaAdapter (val context: Context, val jogos:ArrayList<Jogo>) : BaseAdapter() {

    val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater


    override fun getCount(): Int {
        return jogos.size
    }

    override fun getItem(position: Int): Any {
        return  jogos.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view = inflater.inflate(R.layout.linha_layout, null)

        val nome = view.findViewById<TextView>(R.id.nome)
        val plataforma = view.findViewById<TextView>(R.id.plataforma)

        nome.text = jogos.get(position).name
        plataforma.text = jogos.get(position).plataforma

        return view
    }

}