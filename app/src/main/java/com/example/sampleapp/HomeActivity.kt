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

// Sa loob ng onCreate
val navShop = findViewById<LinearLayout>(R.id.nav_shop)
navShop.setOnClickListener {
    val intent = Intent(this, ShopActivity::class.java)
    startActivity(intent)
}

val navProfile = findViewById<LinearLayout>(R.id.nav_profile)
navProfile.setOnClickListener {
    val intent = Intent(this, ProfileActivity::class.java)
    startActivity(intent)
}
    }
}