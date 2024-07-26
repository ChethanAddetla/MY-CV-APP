package com.example.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var getstart:Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
        getstart=findViewById(R.id.button)

        getstart.setOnClickListener {
           var intent=Intent(this@MainActivity,profile::class.java)
            startActivity(intent)
        }



    }
}