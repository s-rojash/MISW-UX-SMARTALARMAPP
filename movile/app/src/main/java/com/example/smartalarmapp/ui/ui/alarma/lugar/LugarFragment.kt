package com.example.smartalarmapp.ui.ui.alarma.lugar

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.smartalarmapp.R
import com.example.smartalarmapp.ui.NavegadorActivity
import com.example.smartalarmapp.ui.ui.alarma.espacio.EspacioFragment

class LugarFragment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_lugar)
    }

    fun atrasAlarma(view: View){
        val intent= Intent(this, NavegadorActivity::class.java).apply { }
        startActivity(intent)
    }

    fun agregraLugar(view: View){
        val intent= Intent(this, AgregarLugarFragment::class.java).apply { }
        startActivity(intent)
    }

    fun irEspacios(view: View){
        val intent= Intent(this, EspacioFragment::class.java).apply { }
        startActivity(intent)
    }
}