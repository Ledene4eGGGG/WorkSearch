package com.i.worksearch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.i.worksearch.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initNavigation()
    }
    private fun initNavigation(){
        binding.bottomNavigation.setOnClickListener {
            when (it.id) {
            R.id.search-> {
                Toast.makeText(this, "поиск", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.favourites -> {
                Toast.makeText(this, "избранное", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.feedback -> {
                Toast.makeText(this, "отклики", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.message -> {
                Toast.makeText(this, "сообщения", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.profile -> {
                Toast.makeText(this, "профиль", Toast.LENGTH_SHORT).show()
                 true
            }
            else -> false
        }
        }
    }

}