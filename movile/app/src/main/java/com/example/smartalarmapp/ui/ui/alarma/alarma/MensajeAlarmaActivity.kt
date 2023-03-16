package com.example.smartalarmapp.ui.ui.alarma.alarma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.smartalarmapp.R
import com.example.smartalarmapp.ui.NavegadorActivity

class MensajeAlarmaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mensaje_alarma)
    }

    fun atrasAlarma(view: View){
        val intent= Intent(this, NavegadorActivity::class.java).apply { }
        startActivity(intent)
    }
}