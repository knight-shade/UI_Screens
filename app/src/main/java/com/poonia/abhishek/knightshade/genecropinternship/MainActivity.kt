package com.poonia.abhishek.knightshade.genecropinternship

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.poonia.abhishek.knightshade.genecropinternship.cinema.CinemaTicket
import com.poonia.abhishek.knightshade.genecropinternship.dashboard.Dashboard
import com.poonia.abhishek.knightshade.genecropinternship.details.Details
import com.poonia.abhishek.knightshade.genecropinternship.itunes.ItunesReward
import com.poonia.abhishek.knightshade.genecropinternship.loading.Loading
import com.poonia.abhishek.knightshade.genecropinternship.no_network.NoNetwork
import com.poonia.abhishek.knightshade.genecropinternship.onboarding.OnBoarding
import com.poonia.abhishek.knightshade.genecropinternship.starbucks.StarbucksReward
import com.poonia.abhishek.knightshade.genecropinternship.starbucks.StarbucksRewardsAgain
import com.poonia.abhishek.knightshade.genecropinternship.weekly_activity.WeeklyActivity
import com.poonia.abhishek.knightshade.genecropinternship.weekly_activity.WeeklyActivityAgain
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        btn_onboarding.setOnClickListener {
            startActivity<OnBoarding>()
        }

        btn_loading.setOnClickListener {
            startActivity<Loading>()
        }

        btn_network.setOnClickListener {
            startActivity<NoNetwork>()
        }

        btn_cinema_ticket.setOnClickListener {
            startActivity<CinemaTicket>()
        }

        btn_reward.setOnClickListener {
            startActivity<ItunesReward>()
        }

        btn_starbucks.setOnClickListener {
            startActivity<StarbucksReward>()
        }

        btn_dashboard.setOnClickListener {
            startActivity<Dashboard>()
        }

        btn_details.setOnClickListener {
            startActivity<Details>()
        }

        btn_starbucks_again.setOnClickListener {
            startActivity<StarbucksRewardsAgain>()
        }

        btn_weekly_activity.setOnClickListener {
            startActivity<WeeklyActivity>()
        }

        btn_weekly_activity_again.setOnClickListener {
            startActivity<WeeklyActivityAgain>()
        }
    }
}
