package com.lee.cart.ktbase

import android.app.Activity
import android.view.View


fun <T> Activity.findView(viewId: Int): T {
//    this.findViewById(viewId)
    return this.findViewById(viewId)
}

fun Activity.viewOnClick(viewId: Int, doOnClick: (t: View) -> View.OnClickListener?) {

    val view = this.findViewById<View>(viewId)

    view.setOnClickListener {
        doOnClick(view)?.onClick(view)
    }

}

