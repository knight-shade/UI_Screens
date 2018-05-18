package com.poonia.abhishek.knightshade.genecropinternship.onboarding

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.poonia.abhishek.knightshade.genecropinternship.R
import android.view.WindowManager
import android.os.Build
import android.support.v4.view.PagerAdapter
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.poonia.abhishek.knightshade.genecropinternship.fullScreen
import kotlinx.android.synthetic.main.activity_on_boarding.*


class OnBoarding : AppCompatActivity() {

    private val layouts = intArrayOf(R.layout.welcome_slide_1,
            R.layout.welcome_slide_2,
            R.layout.welcome_slide_3)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.fullScreen()
        setContentView(R.layout.activity_on_boarding)

        tab_dots.setupWithViewPager(view_pager)
        view_pager.adapter = MyViewPagerAdapter()
    }

    inner class MyViewPagerAdapter : PagerAdapter() {
        override fun instantiateItem(container: ViewGroup, position: Int): Any {
            val layoutInflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val view = layoutInflater.inflate(layouts[position], container, false)
            container.addView(view)
            return view
        }

        override fun isViewFromObject(view: View, `object`: Any): Boolean {
            return view.equals(`object`)
        }

        override fun getCount() = layouts.size

        override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
            val view = `object` as View
            container.removeView(view)
        }
    }

}












