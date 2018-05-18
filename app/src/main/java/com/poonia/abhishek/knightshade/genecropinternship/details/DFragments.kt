package com.poonia.abhishek.knightshade.genecropinternship.details


import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.poonia.abhishek.knightshade.genecropinternship.R
import devlight.io.library.ArcProgressStackView
import it.sephiroth.android.library.tooltip.Tooltip
import kotlinx.android.synthetic.main.fragment_about_vitality_age.*
import kotlinx.android.synthetic.main.fragment_my_vitality_age.*
import it.sephiroth.android.library.tooltip.Tooltip.ClosePolicy




class DFragments : Fragment() {

    var mPage = 0
    companion object {
        val ARG_PAGE = "ARG_PAGE"
        fun newInstance(page: Int) : com.poonia.abhishek.knightshade.genecropinternship.details.DFragments {
            val args = Bundle()
            args.putInt(ARG_PAGE, page)
            val fragment = com.poonia.abhishek.knightshade.genecropinternship.details.DFragments()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mPage = arguments!!.getInt(ARG_PAGE)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        if (mPage == 1 ) {
            return inflater.inflate(R.layout.fragment_about_vitality_age, container, false)
        } else {
            return inflater.inflate(R.layout.fragment_my_vitality_age, container, false)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (mPage == 1) {
            val stringColors = resources.getStringArray(R.array.devlight)
            val stringBgColors = resources.getStringArray(R.array.bg)
            val colors = ArrayList<Int>()
            val bgColors = ArrayList<Int>()
            for (i in 0..2) {
                colors.add(Color.parseColor(stringColors[i]))
                bgColors.add(Color.parseColor(stringBgColors[i]))
            }

            val models = ArrayList<ArcProgressStackView.Model>()
            models.add( ArcProgressStackView.Model("My vitality age", 50.toFloat(), bgColors[1], colors[1]))
            models.add( ArcProgressStackView.Model("My age", 35.toFloat(), bgColors[0], colors[0]))
            arc_progress_stack_view.models = models
        } else {
            val max = 2400
            val min = 0
            val total = max - min
            fluid_slider.positionListener = {
                it -> fluid_slider.bubbleText = "${min + (total * it).toInt()}"
            }

            btn_gold.setOnClickListener {btn ->
                Tooltip.make(activity,
                        Tooltip.Builder(101)
                                .anchor(btn_gold, Tooltip.Gravity.BOTTOM)
                                .closePolicy( Tooltip.ClosePolicy()
                                        .insidePolicy(true, false)
                                        .outsidePolicy(true, false), 4000)
                                .activateDelay(900)
                                .showDelay(400)
                                .text("To keep your gold status for next year, you need at-least 1.6k points.")
                                .maxWidth(600)
                                .withArrow(true)
                                .withStyleId(R.style.ToolTipLayoutCustomStyle)
                                .withOverlay(true).build()).show()
            }
        }
    }
}
