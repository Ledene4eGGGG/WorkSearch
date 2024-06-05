package com.i.simplerecipe.holders_rv

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.i.simplerecipe.R
import com.i.simplerecipe.retrofit.Ingridients

class IngridientsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val name = itemView.findViewById<TextView>(R.id.list_ingr_item_text)

    fun bind(ingridients: Ingridients) {

        name.text = ingridients.name
    }
}