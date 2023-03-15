package com.example.smartalarmapp.ui.ui.recordatorio

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AlarmaViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is alarma Fragment"
    }
    val text: LiveData<String> = _text
}