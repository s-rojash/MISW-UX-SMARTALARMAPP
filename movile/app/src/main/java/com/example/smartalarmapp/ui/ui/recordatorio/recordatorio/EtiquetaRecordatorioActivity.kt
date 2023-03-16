package com.example.smartalarmapp.ui.ui.recordatorio.recordatorio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.smartalarmapp.R

class EtiquetaRecordatorioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_etiqueta_recordatorio)
    }

    fun atrasRecordatorio(view: View){
        val intent= Intent(this, AgregarRecordatorioActivity::class.java).apply { }
        startActivity(intent)
    }
}