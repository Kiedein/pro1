package com.example.sampleapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Ikinokonekta nito ang Kotlin code sa activity_main.xml na layout
        setContentView(R.layout.activity_main)

        // Hinahanap ang "Get Started" button gamit ang ID na btn_get_started
        val btnGetStarted = findViewById<Button>(R.id.btn_get_started)

        // Naghihintay ng click event mula sa user
        btnGetStarted.setOnClickListener {
            // Gumagawa ng "Intent" para lumipat mula MainActivity papuntang HomeActivity
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            
            /* * Tinatawag natin ang finish() para kapag nasa Home Screen na ang user,
             * hindi na siya babalik sa Splash Screen kapag pinindot ang 'Back' button.
             */
            finish()
        }
    }
}