package com.i.simplerecipe.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.i.simplerecipe.MainActivity
import com.i.simplerecipe.adapters_rv.BreakfastAdapter
import com.i.simplerecipe.R
import com.i.simplerecipe.databinding.FragmentBreakfastBinding
import com.i.simplerecipe.retrofit.BreakfastDishes
import com.i.simplerecipe.view_models.BreakfastViewModel


class BreakfastFragment : Fragment() {

    private var _binding: FragmentBreakfastBinding? = null
    private val binding get() = checkNotNull(_binding)
    private lateinit var breakfastAdapter: BreakfastAdapter
    lateinit var viewModel: BreakfastViewModel

    private val itemsBreakfast = listOf(
        BreakfastDishes(1, "Сырники", R.drawable.breakfast, "шаги:3"),
        BreakfastDishes(1, "Каша", R.drawable.breakfast, "шаги:5"),
        BreakfastDishes(1, "Бутерброды", R.drawable.breakfast, "шаги:8"),
        BreakfastDishes(1, "Оладьи", R.drawable.breakfast, "шаги:7"),
        BreakfastDishes(1, "Хачапури", R.drawable.breakfast, "шаги:9"),
        BreakfastDishes(1, "Баклажан", R.drawable.breakfast, "шаги:4")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentBreakfastBinding.inflate(
            layoutInflater, container, false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecycler()

        binding.back.setOnClickListener {
            (requireActivity() as MainActivity).navigateBack()
        }
    }

    private fun initRecycler(){
        breakfastAdapter = BreakfastAdapter()
        binding.breakfastRecycler.apply {
            adapter = breakfastAdapter
            layoutManager = GridLayoutManager(context, 2)
        }
        breakfastAdapter.addItems(itemsBreakfast)
    }
}



