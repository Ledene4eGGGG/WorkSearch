package com.i.simplerecipe.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.i.simplerecipe.R
import com.i.simplerecipe.view_models.DinnerViewModel

class DinnerFragment : Fragment() {

    companion object {
        fun newInstance() = DinnerFragment()
    }

    private lateinit var viewModel: DinnerViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dinner, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DinnerViewModel::class.java)
        // TODO: Use the ViewModel

    }

}