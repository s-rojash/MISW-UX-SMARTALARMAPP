package com.example.smartalarmapp.ui.ui.recordatorio.recordatorio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.smartalarmapp.R
import com.example.smartalarmapp.ui.NavegadorActivity

class CategoriaRecordatorioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categoria_recordatorio)
    }

    fun atrasRecordatorio(view: View){
        val intent= Intent(this, AgregarRecordatorioActivity::class.java).apply { }
        startActivity(intent)
    }
}