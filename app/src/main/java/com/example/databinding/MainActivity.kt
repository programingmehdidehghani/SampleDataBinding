package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = DataModel("Stevdza-San",
        "Android Developer",
        "https://i.postimg.cc/nr0fMmS3/Logo.png"
        )

        binding.dataModel = data
    }
}