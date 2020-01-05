package com.yam.mucketlist.view.fragment

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yam.core.util.RUtil
import com.yam.mucketlist.view.fragment.native.NativeMainFragment

class SplashFragment : MainFragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        wrapper = inflater.inflate(RUtil.getLayoutR(activity!!.applicationContext, "fragment_splash"), null)
        return wrapper
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        Handler().postDelayed(Runnable {
            moveToMain()
        }, 3000)
    }

    fun moveToMain(){
        var fragment = NativeMainFragment()

        var arguments = Bundle()
        arguments.putBoolean("isLogin", false)

        fragment.arguments = arguments

        moveToFragment(fragment)
    }
}