package com.abdielalim.localpride.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.abdielalim.localpride.R
import com.abdielalim.localpride.databinding.ActivityMainBinding
import com.abdielalim.localpride.ui.auth.LocalprideAuth
import com.abdielalim.localpride.ui.auth.AuthActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        init()
    }

    private fun init() {
        binding.bottomNav.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.ic_home -> navigate(R.id.homeFragment)
                R.id.ic_news -> navigate(R.id.newsFragment)
                R.id.ic_favorite -> navigate(R.id.favoriteFragment)
                R.id.ic_profil -> navigate(R.id.profilFragment)
                else -> false
            }
        }
    }

    private fun navigate(id: Int): Boolean {
        findNavController(R.id.navHost).navigate(id)
        return true

    }
}