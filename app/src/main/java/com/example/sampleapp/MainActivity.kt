package com.example.sampleapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. Dito natin kinukuha ang button mula sa XML (activity_main.xml)
        val btnGetStarted = findViewById<Button>(R.id.btn_get_started)

        // 2. Dito natin inilalagay ang "Action" kapag pinindot ang button
        btnGetStarted.setOnClickListener {
            // Ang Intent ang nag-uugnay sa dalawang screens
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            
            // Tinatawag natin ang finish() para hindi na mabalikan ang Splash Screen kapag nag-back ang user
            finish()
        }
    }
}