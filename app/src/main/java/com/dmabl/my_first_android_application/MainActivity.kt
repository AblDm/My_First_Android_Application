package com.dmabl.my_first_android_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val text: TextView = findViewById(R.id.intro)
        text.setOnClickListener(){
            openSecondActivity()
        }
    }

    private fun openSecondActivity(){
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
}