package com.example.sampleapp

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class ShopActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Ikinokonekta sa activity_shop.xml
        setContentView(R.layout.activity_shop)

        // --- BOTTOM NAVIGATION LOGIC ---

        // Pabalik sa Home Screen
        val navHome = findViewById<LinearLayout>(R.id.nav_home)
        navHome.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            /* * Ginagamit natin ang finish() para hindi ma-stack 
             * ang mga screens sa memory ng phone.
             */
            finish() 
        }

        // Papunta sa Profile Screen
        val navProfile = findViewById<LinearLayout>(R.id.nav_profile)
        navProfile.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            finish()
        }

        /* * Ang navShop ay walang listener dito dahil 
         * nasa Shop Screen na tayo mismo.
         */
    }
}