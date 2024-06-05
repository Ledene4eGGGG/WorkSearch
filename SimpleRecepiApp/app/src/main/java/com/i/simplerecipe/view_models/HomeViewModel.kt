package com.i.simplerecipe.view_models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bumptech.glide.Glide
import com.i.simplerecipe.ServiceLocator
import com.i.simplerecipe.retrofit.Product
import com.i.simplerecipe.retrofit.ProductApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class HomeViewModel : ViewModel() {

    private val productApi = ServiceLocator.retrofit.create(ProductApi::class.java)

    private val _dayReceipt = MutableLiveData<Product>()
    val dayReceipt: LiveData<Product> get() = _dayReceipt

    init {
        loadDayReceipt()
    }

    private fun loadDayReceipt() {
        viewModelScope.launch {
            val receipt = withContext(Dispatchers.IO) {
                productApi.getRecepiById("14")
            }
            _dayReceipt.value = receipt
        }
    }
}