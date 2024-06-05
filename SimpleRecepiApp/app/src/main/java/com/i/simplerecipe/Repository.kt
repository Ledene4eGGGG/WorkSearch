package com.i.simplerecipe

import com.i.simplerecipe.retrofit.RecepiDayResponse

interface Repository {

    suspend fun getRecepiDay(productId: Int): RecepiDayResponse
}