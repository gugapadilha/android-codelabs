package com.guga.navigationelements

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.guga.navigationelements.databinding.ActivityToolbarExampleBinding

class ToolbarExampleActivity : AppCompatActivity() {

    private lateinit var _binding : ActivityToolbarExampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityToolbarExampleBinding.inflate(layoutInflater)
        setContentView(_binding.root)

        val navHostFragment = (supportFragmentManager.findFragmentById(_binding.fragmentContainerView.id)) as NavHostFragment
        val navController = navHostFragment.navController

        val appBarConfiguration = AppBarConfiguration(navController.graph)
        // setta o botao de voltar automaticamente, e muda o nome conforme o fragment
        _binding.toolbar.setupWithNavController(navController, appBarConfiguration)
    }
}