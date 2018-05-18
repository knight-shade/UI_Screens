package com.poonia.abhishek.knightshade.genecropinternship.details

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.poonia.abhishek.knightshade.genecropinternship.R
import com.poonia.abhishek.knightshade.genecropinternship.fullScreen
import kotlinx.android.synthetic.main.activity_details.*
import org.jetbrains.anko.toast

class Details : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.fullScreen()
        setContentView(R.layout.activity_details)

        view_pager.adapter = MyFragmentPagerAdapter(supportFragmentManager,this)
        sliding_tabs.setupWithViewPager(view_pager)
    }

    inner class MyFragmentPagerAdapter(fm: FragmentManager, context: Context) : FragmentPagerAdapter(fm) {
        val page_count = 2
        private val tabTitles = arrayOf("ABOUT VITALITY AGE", "MY VITALITY AGE")

        override fun getItem(position: Int): Fragment {
            return DFragments.newInstance(position + 1)
        }

        override fun getCount(): Int = page_count

        override fun getPageTitle(position: Int): CharSequence = tabTitles[position]
    }
}
