package com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.feature.main

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.R
import com.yunpnzr.and_km6_yunianedwirisnawaputra_challenge.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        isHiddenButtonNav()
    }

    private fun isHiddenButtonNav(){
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host) as NavHostFragment
        val navController = navHostFragment.navController

        binding.bnvMain.setupWithNavController(navController)

        navController.addOnDestinationChangedListener {_,destination,_ ->
            when(destination.id){
                R.id.detailFragment -> hideBotomNav()
                else -> showBotomNav()
            }
        }
    }

    private fun showBotomNav() {
        binding.bnvMain.visibility = View.VISIBLE
    }

    private fun hideBotomNav() {
        binding.bnvMain.visibility = View.GONE
    }

}