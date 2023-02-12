package com.riyaz.demoapp

import android.content.Intent
import android.media.Image
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn1 = findViewById<Button>(R.id.btn)
        btn1.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        val fbBtn = findViewById<ImageView>(R.id.face)
        fbBtn.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"))
            startActivity(intent)
        }
        val github = findViewById<ImageView>(R.id.git)
        github.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW,Uri.parse("https://github.com/ShaikRiyaz786r"))
            startActivity(intent)
        }
        val link = findViewById<ImageView>(R.id.link)
        link.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW,Uri.parse("https://www.linkedin.com/in/shaik-riyaz-965177228/"))
            startActivity(intent)
        }
        val snapchat = findViewById<ImageView>(R.id.snap)
        snapchat.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW,Uri.parse("https://accounts.snapchat.com/accounts/login"))
            startActivity(intent)
        }
        val insta = findViewById<ImageView>(R.id.insta)
        insta.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW,Uri.parse("https://www.instagram.com/riyu_riyaz786"))
            startActivity(intent)
        }
        val twit = findViewById<ImageView>(R.id.twit)
        twit.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW,Uri.parse("https://twitter.com/i/flow/login"))
            startActivity(intent)
        }
        val ha = findViewById<ImageView>(R.id.ha)
        ha.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW,Uri.parse("https://www.hackathon.io/login"))
            startActivity(intent)
        }
        val yt = findViewById<ImageView>(R.id.yt)
        yt.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/"))
            startActivity(intent)
        }
    }
}