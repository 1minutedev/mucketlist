package com.yam.mucketlist.view.fragment.native

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yam.core.view.fragment.YFragment
import com.yam.mucketlist.util.RUtil

class NativeMainFragment : YFragment() {
    lateinit var wrapper: View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        wrapper = inflater.inflate(RUtil.getLayoutR(activity!!.applicationContext, "fragment_native_main"), null)
        return wrapper
    }
}