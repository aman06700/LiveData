package com.example.livedatademo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    val factTextView: TextView
        get() = findViewById(R.id.datatv)
    val updateBtn: Button
        get() = findViewById(R.id.updateButton)
    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        mainViewModel.immutableData.observe(this,{
            factTextView.text = it
        })

        updateBtn.setOnClickListener {
            mainViewModel.updateLiveData("Truth is there is no fact")
        }
    }
}