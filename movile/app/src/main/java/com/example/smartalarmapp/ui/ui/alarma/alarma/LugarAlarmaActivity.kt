package com.example.smartalarmapp.ui.ui.alarma.alarma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.smartalarmapp.R

class LugarAlarmaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lugar_alarma)
    }
    fun atrasAlarma(view: View){
        val intent= Intent(this, AgregarAlarmaActivity::class.java).apply { }
        startActivity(intent)
    }
}