package com.example.practicaprueba.viewmodel

import androidx.lifecycle.*
import com.example.practicaprueba.network.RetrofitClient
import com.example.practicaprueba.network.IndicadoresResponse
import kotlinx.coroutines.launch

class IndicadoresViewModel : ViewModel() {

    private val _state = MutableLiveData<IndicadoresResponse?>()
    val state: LiveData<IndicadoresResponse?> = _state

    fun loadIndicadores() {
        viewModelScope.launch {
            try {
                val data = RetrofitClient.indicadoresApi.getIndicadores()
                _state.postValue(data)
            } catch (e: Exception) {
                e.printStackTrace()
                _state.postValue(null)
            }
        }
    }
}
