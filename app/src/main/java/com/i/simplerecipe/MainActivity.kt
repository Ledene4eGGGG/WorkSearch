package com.i.simplerecipe

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.i.simplerecipe.databinding.ActivityMainBinding
import com.i.simplerecipe.ui.home.HomeFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.placeholder, HomeFragment())
            .addToBackStack(null)
            .commit()

        initNavigation()
    }

    private fun initNavigation() {
        val navView: BottomNavigationView = binding.navView

        navView.setOnNavigationItemSelectedListener {

            when (it.itemId) {
                R.id.nav_view -> {
                    val tag = "home"
                    val fragment = checkFragmentExistence(tag)
                    true
                }
                R.id.navigation_search -> {
                    val tag = "favourites"
                    val fragment = checkFragmentExistence(tag)
                    changeFragment( fragment?: SearchFragment(), tag)
                    true
                }
                R.id.navigation_favourites -> {
                    val tag = "watch_later"
                    val fragment = checkFragmentExistence(tag)
                    changeFragment( fragment?: FavouritesFragment(), tag)
                    true
                }
                else -> false
            }
        }
    }

    fun launchBreakfastFragment(){
        val bundle = Bundle()
        val fragment = BreakfastFragment()
        fragment.arguments = bundle

        supportFragmentManager
            .beginTransaction()
            .addToBackStack(null)
            .replace(R.id.placeholder, fragment)
            .commit()
    }

    private fun checkFragmentExistence(tag: String): Fragment? =
        supportFragmentManager.findFragmentByTag(tag)

    private fun changeFragment(fragment: Fragment, tag: String) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.placeholder, fragment, tag)
            .addToBackStack(null)
            .commit()
    }

}

class FavouritesFragment : Fragment() {

}

class SearchFragment : Fragment() {

}

