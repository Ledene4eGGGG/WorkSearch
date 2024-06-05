package com.i.simplerecipe.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.i.simplerecipe.R

class MainDishesFragment : Fragment() {

    companion object {
        fun newInstance() = MainDishesFragment()
    }

    private lateinit var viewModel: MainDishesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main_dishes, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainDishesViewModel::class.java)
        // TODO: Use the ViewModel
    }

}