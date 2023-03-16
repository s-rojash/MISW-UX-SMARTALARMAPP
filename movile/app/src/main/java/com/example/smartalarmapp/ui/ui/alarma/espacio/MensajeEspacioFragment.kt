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


class MensajeEspacioFragment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_mensaje_espacio)
    }

    fun atrasEspacio(view: View){
        val intent= Intent(this, EspacioFragment::class.java).apply { }
        startActivity(intent)
    }

}