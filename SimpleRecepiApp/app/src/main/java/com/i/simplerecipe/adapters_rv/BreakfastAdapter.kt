package com.i.simplerecipe.adapters_rv

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.i.simplerecipe.holders_rv.BreakfastViewHolder
import com.i.simplerecipe.R
import com.i.simplerecipe.retrofit.BreakfastDishes

class BreakfastAdapter(): RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private val items = mutableListOf<BreakfastDishes>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return BreakfastViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.item_breakfast_rv, parent, false))
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is BreakfastViewHolder -> {
                holder.bind(items[position])
            }
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    fun addItems(list: List<BreakfastDishes>) {
        items.clear()
        items.addAll(list)
        notifyDataSetChanged()
    }

    interface OnItemClickListener {
        fun click()
    }
}