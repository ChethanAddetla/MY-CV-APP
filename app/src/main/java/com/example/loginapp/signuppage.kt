package com.example.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class signuppage : AppCompatActivity() {

    private lateinit var uname : EditText
    private lateinit var pword : EditText
    private lateinit var cpword : EditText
    private lateinit var signupbtn : Button
    private lateinit var db : DBManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signuppage)
        uname = findViewById(R.id.editTextText1)
        pword = findViewById(R.id.editTextText2)
        cpword = findViewById(R.id.editTextText3)
        signupbtn = findViewById(R.id.button8)
        db = DBManager(this)

        signupbtn.setOnClickListener{
            val unametext = uname.text.toString()
            val pwordtext = pword.text.toString()
            val cpwordtext = cpword.text.toString()
            val savedata = db.insertdata(unametext,pwordtext)

            if(TextUtils.isEmpty(unametext) || TextUtils.isEmpty(pwordtext) || TextUtils.isEmpty(cpwordtext) ){
                Toast.makeText(this,"Add username,pass,cpass", Toast.LENGTH_SHORT).show()
            }
            else{
                if(pwordtext.equals(cpwordtext)){
                    if(savedata==true){
                        Toast.makeText(this,"Signup Successful", Toast.LENGTH_SHORT).show()
                        intent= Intent(this@signuppage,login::class.java)
                        startActivity(intent)
                    }
                    else{
                        Toast.makeText(this,"User Exists", Toast.LENGTH_SHORT).show()
                    }

                }
                else{
                    Toast.makeText(this,"Password not match", Toast.LENGTH_SHORT).show()
                }
            }


        }
    }




}