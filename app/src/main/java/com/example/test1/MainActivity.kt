package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    public var b1: Button? = null
    public var b2: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b1 = findViewById(R.id.button)
        b2 = findViewById(R.id.button2)

        b1!!.setOnClickListener {
            val intent: Intent = Intent (this, Maytinh::class.java)
            startActivity(intent)
        }
        b2!!.setOnClickListener {
            val intent: Intent = Intent (this, xucxac::class.java)
            startActivity(intent)
        }
    }
}