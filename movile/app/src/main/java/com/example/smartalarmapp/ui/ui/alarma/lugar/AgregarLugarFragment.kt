package com.example.smartalarmapp.ui.ui.alarma.lugar

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.smartalarmapp.R
import com.example.smartalarmapp.ui.NavegadorActivity

class AgregarLugarFragment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_agregar_lugar)
    }

    fun guardarLugar(view: View){
        val intent= Intent(this, MensajeLugarFragment::class.java).apply { }
        startActivity(intent)
    }

    fun atrasLugar(view: View){
        val intent= Intent(this, LugarFragment::class.java).apply { }
        startActivity(intent)
    }
}