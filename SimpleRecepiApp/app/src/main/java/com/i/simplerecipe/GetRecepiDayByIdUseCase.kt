package com.i.simplerecipe

import com.i.simplerecipe.retrofit.RecepiDayResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class GetRecepiDayByIdUseCase(
    private val repository: Repository
) {
    suspend operator fun invoke(productId : Int): RecepiDayResponse {
        return withContext(Dispatchers.IO) {
            repository.getRecepiDay(productId)
        }
    }
}
