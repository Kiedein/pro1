package com.example.sampleapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Mga Category Buttons
        val btnBirthday = findViewById<Button>(R.id.btn_birthday)
        btnBirthday.setOnClickListener {
            startActivity(Intent(this, BirthdayActivity::class.java))
        }

        // Bottom Navigation
        val navShop = findViewById<LinearLayout>(R.id.nav_shop)
        navShop.setOnClickListener {
            startActivity(Intent(this, ShopActivity::class.java))
        }

        val navProfile = findViewById<LinearLayout>(R.id.nav_profile)
        navProfile.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}