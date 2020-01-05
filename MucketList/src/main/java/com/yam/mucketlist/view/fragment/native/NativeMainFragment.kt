package com.yam.mucketlist.view.fragment.native

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yam.core.util.RUtil
import com.yam.core.view.fragment.YFragment
import com.yam.mucketlist.view.fragment.MainFragment

class NativeMainFragment : YFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        wrapper = inflater.inflate(
            RUtil.getLayoutR(
                activity!!.applicationContext,
                "fragment_native_main"
            ), null
        )
        return wrapper
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        var data = arguments;
        var isLogin = data!!.getBoolean("isLogin", false)

        if (!isLogin) {
            var fragment = MainFragment()
            var arguments = Bundle()

            fragment.arguments = arguments

            moveToFragment(fragment)
        }
    }
}