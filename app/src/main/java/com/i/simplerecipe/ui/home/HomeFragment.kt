package com.i.simplerecipe.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.i.simplerecipe.MainActivity
import com.i.simplerecipe.R
import com.i.simplerecipe.ServiceLocator
import com.i.simplerecipe.databinding.FragmentHomeBinding
import com.i.simplerecipe.retrofit.ProductApi
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding: FragmentHomeBinding get() = checkNotNull(_binding)


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val tv = binding.tvRecepi
        val press = binding.btnPress


        val productApi = ServiceLocator.retrofit.create(ProductApi::class.java)


        press.setOnClickListener {
            CoroutineScope(Dispatchers.IO).launch {
                val recepi = productApi.getRecepiById("45")
                    tv.text = recepi.name
            }
        }
        binding.ivBreakfast.setOnClickListener {
            (requireActivity() as MainActivity).launchBreakfastFragment()
        }
    }
}