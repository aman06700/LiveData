package com.example.livedatademo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private val factsData = MutableLiveData<String>("This is a fact")

    val immutableData : LiveData<String>
    get() = factsData
    //this data cant be changed externally
    fun updateLiveData(data: String) {
        factsData.value = data
    }
}