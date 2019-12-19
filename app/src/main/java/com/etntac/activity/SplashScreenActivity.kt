package com.etntac.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {

    override fun onStart() {
        super.onStart()
        supportActionBar?.hide()
        startActivity(Intent(this, MainActivity::class.java))
    }
}
