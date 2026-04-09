package com.example.sampleapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
    }
    // Sa loob ng onCreate
val navHome = findViewById<LinearLayout>(R.id.nav_home)
navHome.setOnClickListener {
    val intent = Intent(this, HomeActivity::class.java)
    startActivity(intent)
    finish() // Optional: para malinis ang stack
}
}