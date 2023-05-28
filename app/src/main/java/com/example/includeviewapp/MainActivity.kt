package com.example.includeviewapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val includeViewBtn = findViewById<Button>(R.id.includeViewBtn)
        includeViewBtn.setOnClickListener {
            startActivity(Intent(this,IncludeViewActivity::class.java))
        }

        val includeViewViewBindingBtn = findViewById<Button>(R.id.includeViewViewBindingBtn)
        includeViewViewBindingBtn.setOnClickListener {
            startActivity(Intent(this,IncludeViewBindingActivity::class.java))
        }
        val includeViewDataBindingBtn = findViewById<Button>(R.id.includeViewDataBindingBtn)
        includeViewDataBindingBtn.setOnClickListener {
            startActivity(Intent(this,IncludeViewDataBindingActivity::class.java))
        }
    }
}