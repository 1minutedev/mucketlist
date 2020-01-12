package com.yam.mucketlist.view.fragment.native

import android.R
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.yam.core.util.RUtil
import com.yam.core.view.fragment.YFragment
import com.yam.mucketlist.view.fragment.MainFragment
import com.yam.mucketlist.view.fragment.native.adapter.MainAdapter
import kotlinx.android.synthetic.main.fragment_native_main.*

open class NativeMainFragment : YFragment() {
    var foodCategories = arrayOf("전체","한식","일식","중식","양식")

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        wrapper = inflater.inflate(RUtil.getLayoutR(activity!!.applicationContext, "fragment_native_main"), null)
        return wrapper
    }

    override fun onInit() {
        var data = arguments;
        var isLogin = data!!.getBoolean("isLogin", false)

        if (!isLogin) {
            var fragment = MainFragment()
            var arguments = Bundle()

            fragment.arguments = arguments

            moveToFragment(fragment, "top")
        } else {
            initLayout()
        }
    }

    fun initLayout(){
        val foodCategoryAdapter = ArrayAdapter(activity!!.applicationContext, R.layout.simple_spinner_dropdown_item, foodCategories)
        spinner_category_food.adapter = foodCategoryAdapter

        rv_main_list.adapter = MainAdapter()
        rv_main_list.layoutManager = LinearLayoutManager(activity)
    }
}