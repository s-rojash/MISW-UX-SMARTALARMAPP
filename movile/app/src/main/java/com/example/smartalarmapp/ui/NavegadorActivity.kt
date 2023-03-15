package com.example.smartalarmapp.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.smartalarmapp.R
import com.example.smartalarmapp.databinding.ActivityNavegadorBinding

class NavegadorActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNavegadorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNavegadorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_navegador)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_alarma, R.id.navigation_recordatorio, R.id.navigation_cronometro, R.id.navigation_perfil
            )
        )
        //setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    fun abrirMain(view: View){
        val intent= Intent(this, MainActivity::class.java).apply { }
        startActivity(intent)
    }
}