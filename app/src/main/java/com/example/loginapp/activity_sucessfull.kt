package com.example.loginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class activity_sucessfull : AppCompatActivity() {

    lateinit var loginbut : ImageButton
    lateinit var toast :Toast



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sucessfull)
        loginbut =findViewById(R.id.button)
        loginbut.setOnClickListener{
            toast = Toast.makeText(this@activity_sucessfull,"Login Sucessfull",Toast.LENGTH_SHORT)
            toast.show()
        }



    }
}