package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val greetingTextView = findViewById<TextView>(R.id.nnnn)
        val inputField = findViewById<EditText>(R.id.tvName)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            greetingTextView.text = "Hello  "+ inputField.text.toString()
        }

    }
}