package com.i.simplerecipe.view_models

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.i.simplerecipe.App
import com.i.simplerecipe.retrofit.RecepiDayResponse
import kotlinx.coroutines.launch

class RecepiDayViewModel : ViewModel() {

    private val getRecepiDayByIdUseCase = App.instance.getRecepiDayByIdUseCase

    private val _recepi = MutableLiveData<RecepiDayResponse>()
    val recepi get() = _recepi

    fun loadRecepiday(productId: Int) = viewModelScope.launch{
        val recepiDay = getRecepiDayByIdUseCase(productId)
        _recepi.value = recepiDay
    }
}
