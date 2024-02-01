package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val greetingTextView = findViewById<TextView>(R.id.nnnn)
        val inputField = findViewById<EditText>(R.id.tvName)
        val button = findViewById<Button>(R.id.button)
        val viewOffersBtn = findViewById<Button>(R.id.viewOffersBtn);
        button.setOnClickListener {
            val value1 = inputField.text.toString()
            if ( value1 == "")
            {
                viewOffersBtn.visibility = INVISIBLE
                Toast.makeText(applicationContext,
                    "Enter the name",
                    Toast.LENGTH_LONG).
                show()
                greetingTextView.text = ""
            }else {
                greetingTextView.text = "Hello  $value1"
//                inputField.text.clear()
                viewOffersBtn.visibility = VISIBLE
            }

            viewOffersBtn.setOnClickListener {
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
            }
        }

    }
}