package com.example.sampleapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Hanapin ang Get Started button na ginawa natin sa XML
        val btnGetStarted = findViewById<Button>(R.id.btn_get_started)

        // Kapag pinindot, pumunta sa HomeActivity
        btnGetStarted.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish() // Isara ang splash screen para hindi mabalikan kapag nag-back
        }
    }
}