package com.poonia.abhishek.knightshade.genecropinternship

import android.app.Activity
import android.os.Build
import android.view.View
import android.view.WindowManager

fun Activity.fullScreen () {
    if (Build.VERSION.SDK_INT >= 21) {
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
    }
    window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
}