package com.example.loginapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class projects : AppCompatActivity() {
    lateinit var but2 : Button
    lateinit var but3 : Button
    lateinit var but4 : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_projects)
        but2 = findViewById(R.id.button11)
        but2.setOnClickListener {
            val url = "https://github.com/ChethanAddetla/SMART-CITY.git" // Replace with the URL you want to open
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
        but3 = findViewById(R.id.button12)
        but3.setOnClickListener {
            val url = "https://github.com/ChethanAddetla/AI-IN-GAMING.git" // Replace with the URL you want to open
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
        but4 = findViewById(R.id.button16)
        but4.setOnClickListener {
            val url = "https://github.com/T-Arjun/Captcha-Verification.git" // Replace with the URL you want to open
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }






    }
}