package com.etntac.helpers

import android.annotation.TargetApi
import android.os.Build
import android.view.View
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ImageView

class AppWebViewClient(val logo: ImageView) : WebViewClient() {
    @TargetApi(Build.VERSION_CODES.N)
    override fun shouldOverrideUrlLoading(view: WebView, request: WebResourceRequest): Boolean {
        view.loadUrl(request.url.toString())
        return true
    }

    override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
        view.loadUrl(url)
        hideLogoAndShowBrowser(view)
        return true
    }

    override fun onPageCommitVisible(view: WebView?, url: String?) {
        hideLogoAndShowBrowser(view)
    }

    private fun hideLogoAndShowBrowser(view: WebView?) {
        logo.visibility = View.GONE
        view?.visibility = View.VISIBLE
    }
}