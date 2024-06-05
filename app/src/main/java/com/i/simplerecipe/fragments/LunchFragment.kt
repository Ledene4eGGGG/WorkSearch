package com.i.simplerecipe.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.i.simplerecipe.R

class LunchFragment : Fragment() {

    companion object {
        fun newInstance() = LunchFragment()
    }

    private lateinit var viewModel: LunchViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_lunch, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(LunchViewModel::class.java)
        // TODO: Use the ViewModel
    }

}