package com.etntac

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {

    override fun onStart() {
        super.onStart()
        supportActionBar?.hide()
        startActivity(Intent(this, MainActivity::class.java))
    }
}
