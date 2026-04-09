package com.example.sampleapp

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class ShopActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Ikinokonekta ang logic sa activity_shop.xml
        setContentView(R.layout.activity_shop)

        // --- BOTTOM NAVIGATION LOGIC ---

        // Pabalik sa Home Screen
        val navHome = findViewById<LinearLayout>(R.id.nav_home)
        navHome.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            
            /* * Tinatawag natin ang finish() para kapag pinindot ang 'Back' sa 
             * phone, hindi na babalik ang user sa Shop kung galing na siyang Home.
             */
            finish() 
        }

        // Papunta sa Profile Screen (mula Shop)
        val navProfile = findViewById<LinearLayout>(R.id.nav_profile)
        navProfile.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            finish()
        }

        /* * Note: Ang nav_shop ay hindi kailangan ng listener dito 
         * dahil ito ang kasalukuyang screen na naka-display.
         */
    }
}