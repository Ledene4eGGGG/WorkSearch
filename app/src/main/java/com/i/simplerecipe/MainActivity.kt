package com.i.simplerecipe

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import com.i.simplerecipe.databinding.ActivityMainBinding
import com.i.simplerecipe.retrofit.ProductApi
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory



class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView
        val tv = binding.tvRecepi
        val press = binding.btnPress

        val productApi = ServiceLocator.retrofit.create(ProductApi::class.java)


        press.setOnClickListener { CoroutineScope(Dispatchers.IO).launch {
            val recepi = productApi.getRecepiById("45")
            runOnUiThread{
                tv.text = recepi.name
            }
         }
        }



    }
}

