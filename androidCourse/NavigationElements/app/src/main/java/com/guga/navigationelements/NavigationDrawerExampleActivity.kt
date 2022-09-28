package com.guga.navigationelements

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.guga.navigationelements.databinding.ActivityNavigationDrawerExampleBinding
import com.guga.navigationelements.databinding.ActivityToolbarExampleBinding

class NavigationDrawerExampleActivity : AppCompatActivity() {

    private lateinit var _binding : ActivityNavigationDrawerExampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityNavigationDrawerExampleBinding.inflate(layoutInflater)
        setContentView(_binding.root)

        val navHostFragment = (supportFragmentManager.findFragmentById(_binding.fragmentContainerView.id)) as NavHostFragment
        val navController = navHostFragment.navController
        _binding.navView.setupWithNavController(navController)

        val appBarConfiguration = AppBarConfiguration(navController.graph, _binding.drawerLayout)
        // setta o botao de voltar automaticamente, e muda o nome conforme o fragment
        _binding.toolbar.setupWithNavController(navController, appBarConfiguration)
    }
}