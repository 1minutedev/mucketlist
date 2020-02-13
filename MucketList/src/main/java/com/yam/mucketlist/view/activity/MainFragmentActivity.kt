package com.yam.mucketlist.view.activity

import android.os.Bundle
import com.yam.core.application.YApplication
import com.yam.core.util.RUtil
import com.yam.core.view.activity.YFragmentActivity
import com.yam.mucketlist.R
import com.yam.mucketlist.view.fragment.splash.SplashFragment

class MainFragmentActivity : YFragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fragment = SplashFragment()
        var arguments = Bundle()

        fragment.arguments = arguments

        supportFragmentManager
            .beginTransaction()
            .replace(RUtil.getIdR(applicationContext, "contents"), fragment, "center")
            .commitAllowingStateLoss()

        YApplication.addFragment(fragment)
    }
}
