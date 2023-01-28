package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input = findViewById<EditText>(R.id.editTextSomething).text
        val btn = findViewById<Button>(R.id.toast_button)
        btn.setOnClickListener{
            Toast.makeText(applicationContext, input, Toast.LENGTH_SHORT).show()
        }
    }
}