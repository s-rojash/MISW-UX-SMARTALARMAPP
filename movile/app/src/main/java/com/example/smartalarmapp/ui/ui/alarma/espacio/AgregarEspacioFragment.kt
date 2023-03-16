package com.example.smartalarmapp.ui.ui.alarma.espacio

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.smartalarmapp.R
import com.example.smartalarmapp.ui.ui.alarma.lugar.LugarFragment
import com.example.smartalarmapp.ui.ui.alarma.lugar.MensajeLugarFragment

class AgregarEspacioFragment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_agregar_espacio)
    }

    fun guardarEspacio(view: View){
        val intent= Intent(this, MensajeEspacioFragment::class.java).apply { }
        startActivity(intent)
    }

    fun atrasEspacio(view: View){
        val intent= Intent(this, EspacioFragment::class.java).apply { }
        startActivity(intent)
    }

}