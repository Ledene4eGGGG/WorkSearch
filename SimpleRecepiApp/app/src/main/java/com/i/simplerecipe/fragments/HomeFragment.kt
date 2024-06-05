package com.i.simplerecipe.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.bumptech.glide.Glide
import com.i.simplerecipe.MainActivity
import com.i.simplerecipe.ServiceLocator
import com.i.simplerecipe.databinding.FragmentHomeBinding
import com.i.simplerecipe.retrofit.ProductApi
import com.i.simplerecipe.view_models.HomeViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding: FragmentHomeBinding get() = checkNotNull(_binding)
    private val viewModel: HomeViewModel by viewModels<HomeViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tv = binding.tvRecepi
        val press = binding.btnPress

        val productApi = ServiceLocator.retrofit.create(ProductApi::class.java)

//        press.setOnClickListener {
            /*CoroutineScope(Dispatchers.IO).launch {
                val recepi = productApi.getRecepiById("14")
                withContext(Dispatchers.Main) {
                    tv.text = recepi.name
                    Glide.with(binding.root.context)
                        .load(recepi.image)
                        .centerCrop()
                        .into(binding.ivRd)
                }
            }*/
//        }
        viewModel.dayReceipt.observe(viewLifecycleOwner) { product ->
            tv.text = product.name
            Glide.with(binding.root.context)
                .load(product.image)
                .centerCrop()
                .into(binding.ivRd)
        }

        binding.ivBreakfast.setOnClickListener {
            (requireActivity() as MainActivity).launchBreakfastFragment()
        }
        binding.ivLunch.setOnClickListener {
            (requireActivity() as MainActivity).launchLunchFragment()
        }
        binding.ivDinner.setOnClickListener {
            (requireActivity() as MainActivity).launchDinnerFragment()
        }
        binding.cvRecepiDay.setOnClickListener {
            val productId = viewModel.dayReceipt.value?.id
            if (productId != null) {
                (requireActivity() as MainActivity).launchRecepiDayFragment(productId)
            }
        }
    }
}
