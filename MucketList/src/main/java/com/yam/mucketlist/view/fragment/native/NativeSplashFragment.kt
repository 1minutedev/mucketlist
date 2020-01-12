package com.yam.mucketlist.view.fragment.native

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yam.core.util.RUtil

class NativeSplashFragment : NativeMainFragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        wrapper = inflater.inflate(RUtil.getLayoutR(activity!!.applicationContext, "fragment_native_splash"), null)
        return wrapper
    }

    override fun onInit() {
        Handler().postDelayed(Runnable {
            moveToMain()
        }, 3000)
    }

    fun moveToMain(){
        var fragment = NativeMainFragment()

        var arguments = Bundle()
        arguments.putBoolean("isLogin", true)

        fragment.arguments = arguments

        moveToFragment(fragment, "fade")
    }
}