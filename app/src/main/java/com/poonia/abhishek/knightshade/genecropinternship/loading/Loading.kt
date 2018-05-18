package com.poonia.abhishek.knightshade.genecropinternship.loading

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.poonia.abhishek.knightshade.genecropinternship.R
import com.poonia.abhishek.knightshade.genecropinternship.fullScreen

class Loading : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.fullScreen()
        setContentView(R.layout.activity_loading)

    }


}
