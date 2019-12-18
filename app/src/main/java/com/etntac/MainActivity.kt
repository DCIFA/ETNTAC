package com.etntac

import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val webView = findViewById<WebView>(R.id.webview)
        webView.loadUrl("http://test.freemind.com.ua/")
    }
}
