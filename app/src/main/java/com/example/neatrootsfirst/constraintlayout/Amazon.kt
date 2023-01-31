package com.example.neatrootsfirst.constraintlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.neatrootsfirst.R

class Amazon : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amazon)

        supportActionBar?.hide()
    }
}