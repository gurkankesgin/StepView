package com.stepview.android

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter


class ViewPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            Steps.FIRST.ordinal -> {
                FragmentFrist()
            }
            Steps.SECOND.ordinal -> {
                FragmentSecond()
            }
            Steps.THIRD.ordinal -> {
                FragmentThird()
            }
            else -> {
                FragmentFrist()
            }
        }
    }

}

const val ARG_OBJECT = "object"