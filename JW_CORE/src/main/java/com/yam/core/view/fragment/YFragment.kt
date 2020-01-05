package com.yam.core.view.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.yam.core.application.YApplication
import com.yam.core.util.RUtil

open class YFragment : Fragment() {
    lateinit var wrapper: View

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        wrapper.isClickable = true
    }

    open fun moveToFragment(fragment: Fragment){
        activity!!.supportFragmentManager
            .beginTransaction()
            .add(RUtil.getIdR(activity!!.applicationContext, "contents"), fragment, "center")
            .commitAllowingStateLoss()

        YApplication.addFragment(fragment)
    }
}