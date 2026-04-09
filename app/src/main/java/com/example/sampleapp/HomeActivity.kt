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

        // --- CATEGORY BUTTONS NAVIGATION ---
        
        // Lilipat papuntang Birthday Screen
        val btnBirthday = findViewById<Button>(R.id.btn_birthday)
        btnBirthday.setOnClickListener {
            startActivity(Intent(this, BirthdayActivity::class.java))
        }

        // Lilipat papuntang Anniversary Screen
        val btnAnniv = findViewById<Button>(R.id.btn_anniv)
        btnAnniv.setOnClickListener {
            startActivity(Intent(this, AnnivActivity::class.java))
        }

        // Lilipat papuntang Graduation Screen
        val btnGrad = findViewById<Button>(R.id.btn_grad)
        btnGrad.setOnClickListener {
            startActivity(Intent(this, GradActivity::class.java))
        }

        // --- BOTTOM NAVIGATION AREA ---

        // Shop Navigation (Home lang ang pwedeng mag-access nito)
        val navShop = findViewById<LinearLayout>(R.id.nav_shop)
        navShop.setOnClickListener {
            startActivity(Intent(this, ShopActivity::class.java))
        }

        // Profile Navigation
        val navProfile = findViewById<LinearLayout>(R.id.nav_profile)
        navProfile.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        /* * Ang navHome ay hindi na kailangan ng listener dito 
         * dahil nasa Home Screen na tayo mismo.
         */
    }
}