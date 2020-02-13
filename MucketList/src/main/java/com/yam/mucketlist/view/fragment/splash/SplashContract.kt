package com.yam.mucketlist.view.fragment.splash

interface SplashContract {

    interface View {
        fun updateCheckComplete()
        fun loginCheckComplete()
    }

    interface Presenter {
        fun setView(view: View)
        fun updateCheck()
        fun loginCheck()
        fun moveToMain()
    }
}