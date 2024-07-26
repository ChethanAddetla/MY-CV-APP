package com.example.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class login : AppCompatActivity() {
    private lateinit var edituser : EditText
    private lateinit var editpword : EditText
    private lateinit var loginbtn : Button
    private lateinit var dbh : DBManager
    private lateinit var sigbtn : Button






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        loginbtn =findViewById(R.id.button5)
        edituser = findViewById(R.id.editTextText)
        editpword = findViewById(R.id.editTextText1)
        sigbtn = findViewById(R.id.button4)

        dbh =DBManager(this)

        loginbtn.setOnClickListener{

            val userdtx = edituser.text.toString()
            val passedtx = editpword.text.toString()

            if(TextUtils.isEmpty(userdtx)|| TextUtils.isEmpty(passedtx)){
                Toast.makeText(this,"Add username,pass,cpass", Toast.LENGTH_SHORT).show()
            }
            else{
                val checkuser = dbh.checkuserpass(userdtx,passedtx)
                if(checkuser == true){
                    Toast.makeText(this,"Login Successful",Toast.LENGTH_SHORT).show()
                    intent= Intent(this@login,MainActivity::class.java)
                    startActivity(intent)
                }
                else{
                    Toast.makeText(this,"wrong",Toast.LENGTH_SHORT).show()
                }
            }


        }




    }
}