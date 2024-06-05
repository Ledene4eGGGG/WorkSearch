package com.i.simplerecipe

import android.app.Application
import com.i.simplerecipe.retrofit.ProductApi

class App : Application() {

    lateinit var getRecepiDayByIdUseCase: GetRecepiDayByIdUseCase

    override fun onCreate() {
        super.onCreate()
        instance = this
        ServiceLocator.initiation(this)
        val productApi = ServiceLocator.retrofit.create(ProductApi::class.java)
        val repository = RepositoryImpl(productApi)
        getRecepiDayByIdUseCase = GetRecepiDayByIdUseCase(repository)
    }
    companion object {
        lateinit var instance: App
            private set
    }
}