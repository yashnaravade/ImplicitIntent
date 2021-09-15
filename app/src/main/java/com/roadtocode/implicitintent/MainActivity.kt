package com.roadtocode.implicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etUrl: EditText = findViewById(R.id.etUrl)

        val btnVisitUrl: Button = findViewById(R.id.btnVisitUrl)
        btnVisitUrl.setOnClickListener {

           // val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.roadtocode.org"))

            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(etUrl.text.toString()))
            startActivity(intent)
        }

        val btnCall: Button = findViewById(R.id.btnCall)
        btnCall.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:8805803087"))
            startActivity(intent)
        }


        val btnShareNow: Button = findViewById(R.id.btnShareNow)
        btnShareNow.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_TEXT, "Hello Everyone, Join amazing courses of Road To Code!")
            startActivity(Intent.createChooser(intent, "Share Road To Code Courses with: "))

        }


    }

}