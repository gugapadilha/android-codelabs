/*
* Copyright (C) 2021 The Android Open Source Project.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.example.dogglers.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.R
import com.example.dogglers.const.Layout
import com.example.dogglers.data.DataSource
import com.example.dogglers.databinding.GridListItemBinding
import kotlinx.android.synthetic.main.vertical_horizontal_list_item.view.*

/**
 * Adapter to inflate the appropriate list item layout and populate the view with information
 * from the appropriate data source
 */
class DogCardAdapter(
    private val context: Context?,
    private val layout: Int
) : RecyclerView.Adapter<DogCardAdapter.DogCardViewHolder>() {

    // TODO: Initialize the data using the List found in data/DataSource
    val dataset = DataSource.dogs

    /**
     * Initialize view elements
     */

    class DogCardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // TODO: Declare and initialize all of the list item UI components
        //next step: adding viewBinding
        val imageView = itemView.image_view
        val textName = itemView.textName
        val textAge = itemView.textAge
        val textHobbies = itemView.textHobbie
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {
        // TODO: Use a conditional to determine the layout type and set it accordingly.
        //  if the layout variable is Layout.GRID the grid list item should be used. Otherwise the
        //  the vertical/horizontal list item should be used.

        // TODO Inflate the layout

        // TODO: Null should not be passed into the view holder. This should be updated to reflect
        //  the inflated layout.

        return when (layout) {
            Layout.GRID -> {
                val adapterLayout = LayoutInflater.from(parent.context)
                    .inflate(R.layout.grid_list_item, parent, false)

                DogCardViewHolder(adapterLayout)

            }
            else -> {

                val adapterLayout = LayoutInflater.from(parent.context)
                    .inflate(R.layout.vertical_horizontal_list_item, parent, false)

                DogCardViewHolder(adapterLayout)
            }
        }
    }

    override fun getItemCount(): Int = dataset.size

    override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {
        // TODO: Get the data at the current position
        val item = dataset[position]

        holder.imageView.setImageResource(item.imageResourceId)
        holder.textName.text = item.name

        val resources = context?.resources

        holder.textAge.text = resources?.getString(R.string.dog_age, item.age)
        holder.textHobbies.text = resources?.getString(R.string.dog_hobbies, item.hobbies)
    }
}
