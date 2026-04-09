package com.example.sampleapp

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class GradActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Ikinokonekta ang logic sa activity_grad.xml (na corrected na)
        setContentView(R.layout.activity_grad)

        // --- NAVIGATION LOGIC ---

        /* * Hinahanap ang Home button sa Bottom Navigation bar.
         * Ginagamit natin ang LinearLayout dahil ito ang container 
         * ng icon at text sa ating XML layout.
         */
        val navHome = findViewById<LinearLayout>(R.id.nav_home)
        
        navHome.setOnClickListener {
            // Pag-trigger ng Intent pabalik sa Home Screen
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            
            // Tinatapos ang activity na ito para bumalik sa main stack
            finish()
        }

        /* * Note: Walang active listeners para sa nav_shop at nav_profile
         * para manatili ang "Home as the Hub" structure.
         */
    }
}