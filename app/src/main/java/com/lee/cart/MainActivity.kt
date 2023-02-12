package com.lee.cart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.lee.cart.ktbase.findView
import com.lee.cart.ktbase.viewOnClick

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        val tv = findView<TextView>(R.id.tv)
//
//        tv.setOnClickListener {
//
//        }

        viewOnClick(R.id.tv) { this }

    }

    override fun onClick(v: View?) {
        println("onclick")
        when (v?.id) {

            R.id.tv -> println("点击了tv")
        }
    }
}