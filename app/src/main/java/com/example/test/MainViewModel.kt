package com.example.test

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel(private val importString: String, service: HelloService) : ViewModel() {

    init {
        Log.d("!!!!!!!!!!!!!!!!!!!!", service.hello())
    }

    fun getString() = importString

    fun asd() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                val someGet = RetrofitBuilder().getRetro().someGet()
                Log.d("!!!!!!!!!!!!!!!!!!!!", "${someGet[0].title}")
            }
        }
    }
}