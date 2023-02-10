package com.example.neatrootsfirst.Class14and15

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.neatrootsfirst.R

class Classfourteen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_classfourteen)

        val btn = findViewById<Button>(R.id.btn)

        //Send Data
        val email = findViewById<EditText>(R.id.email)
        val name = findViewById<EditText>(R.id.name)
        val password = findViewById<EditText>(R.id.pass)
        val sendData = findViewById<Button>(R.id.sendData)

        sendData.setOnClickListener {

            val bundle = Bundle()
            bundle.putString("name",name.text.toString())
            bundle.putString("email",email.text.toString())
            bundle.putString("password",password.text.toString())


            // pass data and open new activity
            val intent = Intent(applicationContext,DataActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)

//            val intent = Intent(this,DataActivity::class.java)
//            intent.putExtras(bundle)
//            startActivity(intent)

        }


        btn.setOnClickListener {

            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.android.com"))
            startActivity(intent)

        }

    }
}