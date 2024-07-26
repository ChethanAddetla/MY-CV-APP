package com.example.loginapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.Toast

class profile : AppCompatActivity() {
    lateinit var but2 : ImageButton
    lateinit var but3 : ImageButton
    lateinit var but4 : ImageButton
    lateinit var but5 : ImageButton
    lateinit var but6 : ImageButton
    lateinit var but7 : ImageButton
    lateinit var toast :Toast

    override fun onCreate(savedInstanceState: Bundle?)  {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        but2 = findViewById(R.id.imageButton2)
        but2.setOnClickListener {
            intent= Intent(this@profile,activity_details::class.java)
            startActivity(intent)
        }

        but3 = findViewById(R.id.imageButton3)
        but3.setOnClickListener {
            val url = "https://www.google.com/maps/place/Raghavendra+Kiranam+And+General+Stores/@16.9912407,78.0398664,228m/data=!3m1!1e3!4m14!1m7!3m6!1s0x3bcbd3c8a3ced111:0x3ea19000b1bfef53!2sRaghavendra+Kiranam+And+General+Stores!8m2!3d16.9912768!4d78.040343!16s%2Fg%2F11sw28bbcd!3m5!1s0x3bcbd3c8a3ced111:0x3ea19000b1bfef53!8m2!3d16.9912768!4d78.040343!16s%2Fg%2F11sw28bbcd?entry=ttu" // Replace with the URL you want to open
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
        but3 = findViewById(R.id.imageButton4)
        but3.setOnClickListener{
            intent= Intent(this@profile,education::class.java)
            startActivity(intent)
        }
        but4 = findViewById(R.id.imageButton5)
        but4.setOnClickListener{
            intent= Intent(this@profile,skills::class.java)
            startActivity(intent)
        }
        but5 = findViewById(R.id.imageButton7)
        but5.setOnClickListener{
            intent= Intent(this@profile,projects::class.java)
            startActivity(intent)
        }


    }
}