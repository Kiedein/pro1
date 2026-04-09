package com.example.sampleapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Ikinokonekta ang code sa activity_main.xml layout
        setContentView(R.layout.activity_main)

        // Hanapin ang button gamit ang ID na btn_get_started
        val btnGetStarted = findViewById<Button>(R.id.btn_get_started)

        btnGetStarted.setOnClickListener {
            // Lilipat mula Splash papuntang HomeActivity
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            
            /* * Ginagamit ang finish() para hindi na makabalik 
             * ang user sa Splash screen pag pinindot ang back button.
             */
            finish()
        }
    }
}