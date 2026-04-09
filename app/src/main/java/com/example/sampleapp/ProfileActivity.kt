package com.example.sampleapp

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Hanapin ang Home button sa Bottom Navigation
        val navHome = findViewById<LinearLayout>(R.id.nav_home)
        
        // Pabalik lang ng Home (Dahil Home lang ang pwedeng mag-access ng Shop)
        navHome.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish() 
        }

        // NOTE: Ang nav_shop ay hindi natin lalagyan ng listener dito 
        // para masunod ang rule na "Home state is the only one to access the shop"
    }
}