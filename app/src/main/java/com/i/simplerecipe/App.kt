package com.i.simplerecipe

import android.app.Application

class App : Application() {

    val objectInAppClass = "Object"

    override fun onCreate() {
        super.onCreate()
        instance = this
        ServiceLocator.initiation(this)

    }
    companion object {
        lateinit var instance: App
            private set
    }
}