package com.yam.core.application

import android.app.Application
import androidx.fragment.app.Fragment

open class YApplication : Application() {

    companion object {
        var fragmentList: ArrayList<Fragment> = ArrayList()

        open fun addFragment(fragment: Fragment){
            YApplication.fragmentList.add(fragment)
        }
    }

    override fun onCreate() {
        super.onCreate()
    }

}