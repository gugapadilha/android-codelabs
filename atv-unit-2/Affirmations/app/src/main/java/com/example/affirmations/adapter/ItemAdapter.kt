package com.example.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.databinding.ListItemBinding
import com.example.affirmations.model.Affirmation

class ItemAdapter(
    private val context: Context,
    private val dataset: List<Affirmation>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)

    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.list.text = context.resources.getString(item.stringResourceId)
        holder.image.setImageResource(item.imageResourceId)
    }

    override fun getItemCount() = dataset.size

    class ItemViewHolder(view: ListItemBinding) : RecyclerView.ViewHolder(view.root) {
        val list = view.itemTitle
        val image = view.itemImage
    }
}