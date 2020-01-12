package com.yam.mucketlist.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import android.widget.LinearLayout
import com.yam.core.view.fragment.YWebFragment
import com.yam.core.util.RUtil
import com.yam.core.view.webview.YWebView

open class MainFragment : YWebFragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        wrapper = inflater.inflate(RUtil.getLayoutR(activity!!.applicationContext, "fragment_main"), null)
        return wrapper
    }

    override fun onInit() {
        var mainView = wrapper.findViewById(RUtil.getIdR(activity!!.applicationContext, "main_view")) as? LinearLayout
        var params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT)

        yWebView = YWebView(activity!!.applicationContext)
        yWebView.webViewClient = WebViewClient()
        yWebView.webChromeClient = WebChromeClient()

        mainView?.addView(yWebView, params)

        yWebView.loadUrl("file:///android_asset/contents/index.html")
    }
}