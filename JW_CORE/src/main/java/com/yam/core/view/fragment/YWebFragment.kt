package com.yam.core.view.fragment

import android.os.Bundle
import com.yam.core.view.webview.YWebView

open class YWebFragment : YFragment() {

    lateinit var yWebView: YWebView

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

}