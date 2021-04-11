package com.canytech.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews : List<View> =
            listOf(tv_box_one, tv_box_two, tv_box_three, tv_box_four, tv_box_five,
                constraint_layout, btn_red, btn_blue, btn_green, btn_yellow)

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View) {
        when (view.id) {
            R.id.tv_box_one -> view.setBackgroundColor(Color.DKGRAY)
            R.id.tv_box_two -> view.setBackgroundColor(Color.GRAY)
            R.id.tv_box_three -> view.setBackgroundResource(android.R.color.holo_red_dark)
            R.id.tv_box_four -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.tv_box_five -> view.setBackgroundResource(android.R.color.holo_blue_bright)

            R.id.btn_red -> tv_box_two.setBackgroundResource(R.color.red)
            R.id.btn_green -> tv_box_three.setBackgroundResource(R.color.green)
            R.id.btn_blue -> tv_box_four.setBackgroundResource(R.color.blue)
            R.id.btn_yellow -> tv_box_five.setBackgroundResource(R.color.yellow)

            else -> view.setBackgroundResource(android.R.color.white)
        }
    }

}