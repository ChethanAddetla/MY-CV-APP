package com.example.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class firstpage : AppCompatActivity() {

    lateinit var loginbut : Button
    lateinit var signupbut :Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firstpage)
        loginbut = findViewById(R.id.button6)
        signupbut = findViewById(R.id.button7)

        loginbut.setOnClickListener{
            intent= Intent(this@firstpage,login::class.java)
            startActivity(intent)
        }
        signupbut.setOnClickListener{
            intent= Intent(this@firstpage,signuppage::class.java)
            startActivity(intent)
        }



    }
}