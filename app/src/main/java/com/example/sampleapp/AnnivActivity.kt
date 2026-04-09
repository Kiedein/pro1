package com.example.sampleapp

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class AnnivActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Ikinokonekta ang logic sa activity_anniv.xml
        setContentView(R.layout.activity_anniv)

        // --- NAVIGATION LOGIC ---

        // Hanapin ang Home button sa Bottom Navigation bar
        val navHome = findViewById<LinearLayout>(R.id.nav_home)
        
        navHome.setOnClickListener {
            // Pag-trigger ng Intent pabalik sa HomeActivity
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            
            // Tatapusin ang activity na ito para hindi mag-stack ang screens
            finish()
        }

        /* * Note: Walang click listener para sa nav_shop at nav_profile 
         * dito para mapanatili ang simplified flow na hiningi mo.
         */
    }
}