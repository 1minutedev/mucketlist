package com.yam.mucketlist.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yam.core.view.fragment.YWebFragment
import com.yam.mucketlist.util.RUtil

open class MainFragment : YWebFragment() {
    lateinit var wrapper: View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        wrapper = inflater.inflate(RUtil.getLayoutR(activity!!.applicationContext, "fragment_main"), null)
        return wrapper
    }
}