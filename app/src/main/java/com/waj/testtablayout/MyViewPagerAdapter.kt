package com.waj.testtablayout

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.ViewPager

class MyViewPagerAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm) {
    override fun getItem(p0: Int): Fragment {
        return BlankFragment.newInstance("$p0","$p0")
    }

    override fun getCount(): Int {
        return 8
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return "第${position}页"
    }
}