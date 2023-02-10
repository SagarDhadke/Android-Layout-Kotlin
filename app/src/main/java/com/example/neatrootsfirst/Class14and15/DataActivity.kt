package com.example.neatrootsfirst.Class14and15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.neatrootsfirst.R

class DataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)

        val getName = findViewById<TextView>(R.id.getName)
        val getEmail = findViewById<TextView>(R.id.getEmail)
        val getPass = findViewById<TextView>(R.id.getPass)

        val bundle = intent.extras
        if (bundle != null){
            getName.text = "name ${bundle.getString("name")}"
            getEmail.text = "email ${bundle.getString("email")}"
            getPass.text = "password ${bundle.getString("password")}"
        }

    }
}