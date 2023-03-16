package com.example.smartalarmapp.ui.ui.alarma.espacio

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.smartalarmapp.R
import com.example.smartalarmapp.ui.NavegadorActivity
import com.example.smartalarmapp.ui.ui.alarma.lugar.AgregarLugarFragment
import com.example.smartalarmapp.ui.ui.alarma.lugar.LugarFragment

class EspacioFragment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_espacio)
    }

    fun atrasLugares(view: View){
        val intent= Intent(this, LugarFragment::class.java).apply { }
        startActivity(intent)
    }

    fun agregraEspacio(view: View){
        val intent= Intent(this, AgregarEspacioFragment::class.java).apply { }
        startActivity(intent)
    }
}