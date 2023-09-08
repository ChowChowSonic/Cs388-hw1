package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var ctr = 0L
    private var delta = 1L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.upgradebtn).setOnClickListener{
            findViewById<Button>(R.id.button).setOnClickListener {
                ctr+=2
                findViewById<TextView>(R.id.textView).text = ctr.toString()
            }
            findViewById<Button>(R.id.upgradebtn).visibility = View.INVISIBLE
        }
        findViewById<Button>(R.id.button).setOnClickListener {
            ctr++
            findViewById<TextView>(R.id.textView).text = ctr.toString()
            if(ctr > 100){
                findViewById<Button>(R.id.upgradebtn).visibility = View.VISIBLE
            }
        }
    }
}