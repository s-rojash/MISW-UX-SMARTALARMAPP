package com.example.smartalarmapp.ui.ui.alarma.alarma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.smartalarmapp.R
import com.example.smartalarmapp.ui.NavegadorActivity
import com.example.smartalarmapp.ui.ui.alarma.lugar.LugarFragment

class AgregarAlarmaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agregar_alarma)
    }

    fun abrirRepetir(view: View){
        val intent= Intent(this, RepetirAlarmaActivity::class.java).apply { }
        startActivity(intent)
    }
    fun abrirSonido(view: View){
        val intent= Intent(this, SonidoAlarmaActivity::class.java).apply { }
        startActivity(intent)
    }
    fun abrirLugar(view: View){
        val intent= Intent(this, LugarAlarmaActivity::class.java).apply { }
        startActivity(intent)
    }
    fun guardarAlarma(view: View){
        val intent= Intent(this, MensajeAlarmaActivity::class.java).apply { }
        startActivity(intent)
    }
    fun atrasAlarma(view: View){
        val intent= Intent(this, NavegadorActivity::class.java).apply { }
        startActivity(intent)
    }
}