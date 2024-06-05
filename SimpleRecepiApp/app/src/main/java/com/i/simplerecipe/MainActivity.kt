package com.i.simplerecipe

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.add
import androidx.fragment.app.replace
import com.i.simplerecipe.databinding.ActivityMainBinding
import com.i.simplerecipe.fragments.BreakfastFragment
import com.i.simplerecipe.fragments.DinnerFragment
import com.i.simplerecipe.fragments.HomeFragment
import com.i.simplerecipe.fragments.LunchFragment
import com.i.simplerecipe.fragments.RecepiDayFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initNavigation()
        supportFragmentManager
            .beginTransaction()
            .add(R.id.placeholder, HomeFragment())
            .addToBackStack(null)
            .commit()


    }

    private fun initNavigation() {
        val navView: BottomNavigationView = binding.navView

        navView.setOnNavigationItemSelectedListener {

            when (it.itemId) {
                R.id.navigation_home -> {
                    val tag = "home"
                    val fragment = checkFragmentExistence(tag)
                    changeFragment( fragment?: HomeFragment(), tag)
                    true
                }
                R.id.navigation_search -> {
                    val tag = "favourites"
                    val fragment = checkFragmentExistence(tag)
                    changeFragment( fragment?: com.i.simplerecipe.SearchFragment(), tag)
                    true
                }
                R.id.navigation_favourites -> {
                    val tag = "watch_later"
                    val fragment = checkFragmentExistence(tag)
                    changeFragment( fragment?: com.i.simplerecipe.FavouritesFragment(), tag)
                    true
                }
                else -> false
            }
        }
    }

    fun navigateBack() {
        supportFragmentManager.popBackStack()
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

    fun launchLunchFragment() {
        val bundle = Bundle()
        val fragment = LunchFragment()
        fragment.arguments = bundle

        supportFragmentManager
            .beginTransaction()
            .addToBackStack(null)
            .replace(R.id.placeholder, fragment)
            .commit()
    }

    fun launchDinnerFragment() {
        val bundle = Bundle()
        val fragment = DinnerFragment()
        fragment.arguments = bundle

        supportFragmentManager
            .beginTransaction()
            .addToBackStack(null)
            .replace(R.id.placeholder, fragment)
            .commit()
    }

    fun launchRecepiDayFragment(productId: Int) {
        val bundle = Bundle()
        bundle.putInt("productId", productId)
        val fragment = RecepiDayFragment()
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

