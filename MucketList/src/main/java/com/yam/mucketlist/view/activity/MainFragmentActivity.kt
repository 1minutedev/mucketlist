package com.yam.mucketlist.view.activity

import android.os.Bundle
import com.yam.core.view.activity.YFragmentActivity
import com.yam.mucketlist.R

class MainFragmentActivity : YFragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
