package com.example.kobitontestproject

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val testButton = findViewById<Button>(R.id.testButton)
        val helloWorld = findViewById<TextView>(R.id.textView)
        testButton.setOnClickListener(onClickTestButton(helloWorld))
    }

    @SuppressLint("SetTextI18n")
    private fun onClickTestButton (textView: TextView): View.OnClickListener? {
        textView.text = "clicked test button"
        return null
    }
}