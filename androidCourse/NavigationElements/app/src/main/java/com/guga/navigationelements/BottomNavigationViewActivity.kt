package com.guga.navigationelements

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.guga.navigationelements.databinding.ActivityBottomNavigationViewBinding
import com.guga.navigationelements.databinding.ActivityNavigationDrawerExampleBinding

class BottomNavigationViewActivity : AppCompatActivity() {

    private lateinit var _binding : ActivityBottomNavigationViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityBottomNavigationViewBinding.inflate(layoutInflater)
        setContentView(_binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(_binding.fragmentContainerView2.id) as NavHostFragment
        val navController = navHostFragment.navController

        _binding.bottomNavigationView.setupWithNavController(navController)
    }
}