package com.poonia.abhishek.knightshade.genecropinternship.cinema

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.NumberPicker
import com.poonia.abhishek.knightshade.genecropinternship.R
import com.poonia.abhishek.knightshade.genecropinternship.fullScreen
import kotlinx.android.synthetic.main.activity_cinema_ticket.*

class CinemaTicket : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.fullScreen()
        setContentView(R.layout.activity_cinema_ticket)
        number_picker.orientation = NumberPicker.HORIZONTAL
    }
}
