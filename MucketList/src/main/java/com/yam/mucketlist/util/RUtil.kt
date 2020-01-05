package com.yam.mucketlist.util

import android.content.Context

class RUtil {
    companion object{
        fun getLayoutR(context: Context, layoutName: String): Int {
            var packageName = context.packageName
            return context.resources.getIdentifier(layoutName, "layout", packageName)
        }

        fun getIdR(context: Context, idName: String): Int {
            var packageName = context.packageName
            return context.resources.getIdentifier(idName, "id", packageName)
        }
    }
}