package com.i.simplerecipe.adapters_rv

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.i.simplerecipe.R
import com.i.simplerecipe.holders_rv.BreakfastViewHolder
import com.i.simplerecipe.holders_rv.IngridientsViewHolder
import com.i.simplerecipe.retrofit.BreakfastDishes
import com.i.simplerecipe.retrofit.Ingridients

class ListIngridientsAdapter() : RecyclerView.Adapter<IngridientsViewHolder>() {

    val item = mutableListOf<Ingridients>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IngridientsViewHolder {
        return IngridientsViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.item_ingridients_list, parent, false))

    }

    override fun getItemCount() = item.size

    override fun onBindViewHolder(holder: IngridientsViewHolder, position: Int) {
        when (holder) {
            is IngridientsViewHolder -> {
                holder.bind(item[position])
            }
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    fun addItems(list: List<Ingridients>) {
        item.clear()
        item.addAll(list)
        notifyDataSetChanged()
    }
}