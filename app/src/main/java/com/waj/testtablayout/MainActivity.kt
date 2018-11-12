package com.waj.testtablayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout.addTab(tabLayout.newTab().setText("Tab 1").setIcon(R.drawable.ic_launcher_background))
        tabLayout.addTab(tabLayout.newTab().setText("Tab 2"))
        tabLayout.addTab(tabLayout.newTab().setText("Tab 3"))
        tabLayout.addTab(tabLayout.newTab().setText("Tab 4"))
        tabLayout.addTab(tabLayout.newTab().setText("Tab 5"))
        tabLayout.addTab(tabLayout.newTab().setText("Tab 6"))
        tabLayout.addTab(tabLayout.newTab().setText("Tab 7"))

        tabLayout.setOnTabSelectedListener(object:TabLayout.OnTabSelectedListener{
            override fun onTabReselected(p0: TabLayout.Tab?) {

            }

            override fun onTabUnselected(p0: TabLayout.Tab?) {

            }

            override fun onTabSelected(p0: TabLayout.Tab?) {

            }
        })

        vp.adapter = MyViewPagerAdapter(supportFragmentManager)
        tabLayout.setupWithViewPager(vp)
    }
}
