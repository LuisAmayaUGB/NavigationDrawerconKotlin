package com.example.mynvy1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RedViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "seeeeeeeeeeeeeeeeeeeeeee"
    }
    val text: LiveData<String> = _text
}