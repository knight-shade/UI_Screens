package com.poonia.abhishek.knightshade.genecropinternship.dashboard

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem
import com.poonia.abhishek.knightshade.genecropinternship.R
import com.poonia.abhishek.knightshade.genecropinternship.fullScreen
import kotlinx.android.synthetic.main.activity_dashboard.*

class Dashboard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.fullScreen()
        setContentView(R.layout.activity_dashboard)

        val item1 = AHBottomNavigationItem("My Vitality", R.drawable.ic_like)
        val item2 = AHBottomNavigationItem("My Card", R.drawable.ic_id_card)
        val item3 = AHBottomNavigationItem("Vitality GP", R.drawable.ic_briefcase)
        val item4 = AHBottomNavigationItem("Settings", R.drawable.icon_setting)

        bottom_navigation.addItem(item1)
        bottom_navigation.addItem(item2)
        bottom_navigation.addItem(item3)
        bottom_navigation.addItem(item4)
    }
}
