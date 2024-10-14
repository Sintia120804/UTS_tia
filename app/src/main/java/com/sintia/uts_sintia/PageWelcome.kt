package com.sintia.uts_sintia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PageWelcome : AppCompatActivity() {
    private lateinit var btnLog : Button
    private lateinit var btnSign : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_welcome)
        btnLog=findViewById(R.id.btnLog)
        btnSign=findViewById(R.id.btnSign)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btnLog.setOnClickListener() {
            val intentMenu2 = Intent(this@PageWelcome, PageLogin::class.java)
            startActivity(intentMenu2)
        }
        btnSign.setOnClickListener() {
            val intentMenu2 = Intent(this@PageWelcome, PageSignUp::class.java)
            startActivity(intentMenu2)
        }


    }
}