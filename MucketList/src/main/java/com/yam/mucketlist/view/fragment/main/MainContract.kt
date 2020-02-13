package com.yam.mucketlist.view.fragment.main

interface MainContract {

    interface View {
    }

    interface Presenter {
        fun setView(view: MainContract.View)
        fun showLoginPage()
        fun initLayout()
    }
}