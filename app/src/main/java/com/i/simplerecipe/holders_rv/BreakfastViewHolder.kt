package com.i.simplerecipe

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.i.simplerecipe.retrofit.BreakfastDishes

class BreakfastViewHolder(private val itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val image = itemView.findViewById<ImageView>(R.id.br_iv)
    private val name = itemView.findViewById<TextView>(R.id.br_name)
    private val steps = itemView.findViewById<TextView>(R.id.br_steps)

    fun bind(breakfastDishes: BreakfastDishes) {

        name.text = breakfastDishes.name
        image.setImageResource(breakfastDishes.image)
        steps.text = breakfastDishes.steps
    }
}