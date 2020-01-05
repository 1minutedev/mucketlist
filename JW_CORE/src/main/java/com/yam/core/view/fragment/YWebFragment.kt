package com.yam.core.view.fragment

import android.os.Bundle
import android.util.Log
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import android.widget.LinearLayout
import com.yam.core.util.RUtil
import com.yam.core.view.webview.YWebView

open class YWebFragment : YFragment() {
    lateinit var yWebView: YWebView

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        var mainView = wrapper.findViewById(RUtil.getIdR(activity!!.applicationContext, "main_view")) as? LinearLayout
        var params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT)

        yWebView = YWebView(activity!!.applicationContext)
        yWebView.webViewClient = WebViewClient()
        yWebView.webChromeClient = WebChromeClient()

        mainView?.addView(yWebView, params)

        yWebView.loadUrl("file:///android_asset/contents/index.html")
    }

}