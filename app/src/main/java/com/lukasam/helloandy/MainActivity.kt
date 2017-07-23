package com.lukasam.helloandy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        increase.setOnClickListener {
            currentValue.text = (currentValue.text.toString().toInt() + 1).toString()
        }

        decrease.setOnClickListener {
            var curVal  = currentValue.text.toString().toInt()
            when (curVal) {
                0 -> print("Doesn't work.")
                else -> currentValue.text = (curVal - 1).toString()
            }
        }

    }
}
