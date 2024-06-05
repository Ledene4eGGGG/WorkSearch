package com.i.simplerecipe

import com.i.simplerecipe.retrofit.ProductApi
import com.i.simplerecipe.retrofit.RecepiDayResponse

class RepositoryImpl(private val api: ProductApi) : Repository {


    override suspend fun getRecepiDay(productId: Int): RecepiDayResponse {
        return api.getRecepiDay(productId)
    }

}