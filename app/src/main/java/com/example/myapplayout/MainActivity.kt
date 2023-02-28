package com.example.myapplayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun vertical() {
        val intent = Intent(this, Verticalfunction::class.java)
        // start your next activity
        startActivity(intent)
    }
}