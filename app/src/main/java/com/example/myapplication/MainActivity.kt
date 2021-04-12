package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1 = findViewById<Button>(R.id.button1)
        val textView = findViewById<TextView>(R.id.textView2)
        val button2 = findViewById<Button>(R.id.button2)
        var count = 0
        textView.text="$count"
        button1.setOnClickListener{
            ++count
            textView.text="$count"
        }
        button2.setOnClickListener{
            --count
            textView.text="$count"
        }
    }
}