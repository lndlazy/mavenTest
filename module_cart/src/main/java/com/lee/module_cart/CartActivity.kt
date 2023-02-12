package com.lee.module_cart

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class CartActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_cart)

        println(" =========== 启动了 CartActivity =========== ")
    }
}