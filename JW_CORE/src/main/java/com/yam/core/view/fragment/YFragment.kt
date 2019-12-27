package com.yam.core.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.yam.core.application.YApplication

open class YFragment : Fragment() {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        YApplication.addFragment(this)
    }

}