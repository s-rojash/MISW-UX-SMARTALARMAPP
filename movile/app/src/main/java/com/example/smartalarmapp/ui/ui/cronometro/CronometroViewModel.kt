package com.example.smartalarmapp.ui.ui.cronometro

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CronometroViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is cronometro Fragment"
    }
    val text: LiveData<String> = _text
}