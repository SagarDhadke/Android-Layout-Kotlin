package com.example.neatrootsfirst.constraintlayout

import android.app.Notification.Action
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.neatrootsfirst.R

class Amazon : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amazon)

        supportActionBar?.hide()

        val imageClick = findViewById<ImageView>(R.id.imageView2)

        imageClick.setOnClickListener {
            val intent = Intent(Intent.ACTION_PICK)
            intent.setData(Uri.parse("https://www.amazon.com/"))
            startActivity(intent)
        }
    }
}