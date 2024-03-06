package com.i.simplerecipe.retrofit

import retrofit2.http.GET
import retrofit2.http.Path

interface ProductApi {
    @GET("recipes/{name}")
   suspend fun getRecepiById(@Path("name") name : String): Product
}