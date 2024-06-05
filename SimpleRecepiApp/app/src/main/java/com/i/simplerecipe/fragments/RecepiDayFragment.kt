package com.i.simplerecipe.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.bumptech.glide.Glide
import com.i.simplerecipe.MainActivity
import com.i.simplerecipe.adapters_rv.ListIngridientsAdapter
import com.i.simplerecipe.databinding.FragmentRecepiDayBinding
import com.i.simplerecipe.retrofit.Ingridients
import com.i.simplerecipe.view_models.RecepiDayViewModel

class RecepiDayFragment : Fragment() {

    private var _binding: FragmentRecepiDayBinding? = null
    private val binding get() = checkNotNull(_binding)

    private lateinit var listIngridientsAdapter: ListIngridientsAdapter

    private val viewModel: RecepiDayViewModel by viewModels()

    private val itemIngridients = listOf(
        Ingridients("яйца"),
        Ingridients("молоко"),
        Ingridients("хлеб"),
        Ingridients("мука")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentRecepiDayBinding.inflate(
            layoutInflater, container, false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecycler()

        viewModel.loadRecepiday(requireArguments().getInt("productId"))
        viewModel.recepi.observe(viewLifecycleOwner) {
            if (it != null) {
                Glide.with(binding.root)
                    .load(it.image)
                    .centerCrop()
                    .into(binding.imRecepi)
            }
                binding.tvName.text = it.name
        }

        binding.back.setOnClickListener {
            (requireActivity() as MainActivity).navigateBack()
        }
    }

    private fun initRecycler(){
        listIngridientsAdapter = ListIngridientsAdapter()
        binding.listViewWithCheckbox.adapter = listIngridientsAdapter
        listIngridientsAdapter.addItems(itemIngridients)
    }

}
