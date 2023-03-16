package com.example.smartalarmapp.ui.ui.recordatorio.recordatorio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.smartalarmapp.R
import com.example.smartalarmapp.ui.NavegadorActivity
import com.example.smartalarmapp.ui.ui.alarma.alarma.LugarAlarmaActivity
import com.example.smartalarmapp.ui.ui.alarma.alarma.MensajeAlarmaActivity
import com.example.smartalarmapp.ui.ui.alarma.alarma.RepetirAlarmaActivity
import com.example.smartalarmapp.ui.ui.alarma.alarma.SonidoAlarmaActivity

class AgregarRecordatorioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agregar_recordatorio)
    }

    fun abrirRepetir(view: View){
        val intent= Intent(this, RepetirRecordatorioActivity::class.java).apply { }
        startActivity(intent)
    }
    fun abrirSonido(view: View){
        val intent= Intent(this, SonidoRecordatorioActivity::class.java).apply { }
        startActivity(intent)
    }
    fun abrirCategoria(view: View){
        val intent= Intent(this, CategoriaRecordatorioActivity::class.java).apply { }
        startActivity(intent)
    }
    fun abrirEtiqueta(view: View){
        val intent= Intent(this, EtiquetaRecordatorioActivity::class.java).apply { }
        startActivity(intent)
    }
    fun abrirMapa(view: View){
        val intent= Intent(this, MapaRecordatorioActivity::class.java).apply { }
        startActivity(intent)
    }
    fun atrasRecordatorio(view: View){
        val intent= Intent(this, NavegadorActivity::class.java).apply { }
        startActivity(intent)
    }
}