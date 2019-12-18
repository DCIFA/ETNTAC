package com.etntac

import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        startWebView()
    }

    private fun startWebView() {
        val webView = findViewById<WebView>(R.id.web_view)
        webView.loadUrl(BuildConfig.BASE_URL)
    }
}
