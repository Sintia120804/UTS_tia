package com.sintia.uts_sintia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PageLogin : AppCompatActivity() {
    private lateinit var txtSignUp : TextView
    private lateinit var btnLogin : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_login)
        txtSignUp = findViewById(R.id.txtLogg)
        btnLogin= findViewById(R.id.btnlogin)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btnLogin.setOnClickListener(){
            val intentMenu2 = Intent(this@PageLogin, RecycleMakananActivity::class.java)
            startActivity(intentMenu2)
        }

        txtSignUp.setOnClickListener(){
            val intentMenu2 = Intent(this@PageLogin, PageSignUp::class.java)
            startActivity(intentMenu2)
        }

    }
}