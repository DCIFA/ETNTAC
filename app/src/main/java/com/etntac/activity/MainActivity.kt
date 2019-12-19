package com.etntac.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.etntac.BuildConfig
import com.etntac.R
import com.etntac.helpers.AppWebViewClient
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        startWebView()
    }
    
    private fun startWebView() {
        web_view.settings.javaScriptEnabled = true
        web_view.webViewClient = AppWebViewClient(logo)
        web_view.loadUrl(BuildConfig.BASE_URL)
    }

    override fun onBackPressed() {
        if (web_view.canGoBack()) {
            web_view.goBack()
        } else {
            super.onBackPressed()
        }
    }
}