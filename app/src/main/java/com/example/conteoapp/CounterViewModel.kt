package com.example.conteoapp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {

    // Estado: solo el ViewModel puede modificarlo
    var contador by mutableIntStateOf(0)
        private set

    // Evento: la UI llama a esta función
    fun incrementar() {
        if (contador < 10){ contador ++}
    }
}
