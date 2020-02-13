package com.yam.mucketlist.view.fragment.splash

import android.os.Bundle
import com.yam.core.view.fragment.YFragment
import com.yam.mucketlist.view.fragment.main.MainFragment

class SplashPresenter : SplashContract.Presenter {
    private var view: SplashContract.View? = null

    override fun setView(view: SplashContract.View) {
        this.view = view
    }

    /**
     * 업데이트 체크
     */
    override fun updateCheck() {
        view!!.updateCheckComplete()
    }

    /**
     * 로그인 체크
     */
    override fun loginCheck() {
        view!!.loginCheckComplete()
    }

    /**
     * 스플래시 화면에서의 작업이 모두 끝나고,
     * 메인 화면으로 진입하는 메서드
     */
    override fun moveToMain() {
        var fragment = MainFragment()

        var arguments = Bundle()
        arguments.putBoolean("isLogin", true)

        fragment.arguments = arguments

        (view as YFragment).moveToFragment(fragment, "fade")
    }
}