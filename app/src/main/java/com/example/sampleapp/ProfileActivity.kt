package com.example.sampleapp

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Ikinokonekta ang logic sa activity_profile.xml (na corrected na ang &lt;)
        setContentView(R.layout.activity_profile)

        // --- NAVIGATION LOGIC ---

        /* * Hanapin ang Home button sa Bottom Navigation bar.
         * Dahil ang Home ang tanging "Hub" na pwedeng mag-access sa Shop,
         * dito tayo laging babalik para makapag-navigate sa ibang screens.
         */
        val navHome = findViewById<LinearLayout>(R.id.nav_home)
        
        navHome.setOnClickListener {
            // Pag-trigger ng Intent pabalik sa HomeActivity
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            
            /* * Tinatawag natin ang finish() para isara ang Profile screen.
             * Ito ay para hindi magpatong-patong ang screens sa memory ng cellphone.
             */
            finish() 
        }

        /* * Note: Walang click listener para sa nav_shop at nav_profile.
         * Ang nav_shop ay nananatiling static (hindi napipindot) mula rito
         * upang masunod ang iyong rule na "Home state is the only one to access the shop".
         */
    }
}