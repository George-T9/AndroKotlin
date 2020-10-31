package com.bubble.androidtutorialkotlin.tabLayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.bubble.androidtutorialkotlin.R
import com.google.android.material.tabs.TabLayout

class MainTabActivity : AppCompatActivity() {
    lateinit var tabLayout:TabLayout
    lateinit var viewPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.k_activity_tab)
        tabLayout=findViewById(R.id.tabLayout)
        viewPager=findViewById(R.id.viewPager)

        tabLayout.addTab(tabLayout.newTab().setText("Output"))
        tabLayout.addTab(tabLayout.newTab().setText("XML"))
        tabLayout.addTab(tabLayout.newTab().setText("Code"))
        tabLayout.addTab(tabLayout.newTab().setText("Adapter"))

        tabLayout.tabGravity=TabLayout.GRAVITY_FILL

        viewPager.apply {
            adapter= TabAdapter(this@MainTabActivity,supportFragmentManager,tabLayout.tabCount)
            addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
        }

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener
            {
                override fun onTabSelected(tab: TabLayout.Tab?) {
                    viewPager.currentItem= tab!!.position
                }

                override fun onTabUnselected(tab: TabLayout.Tab?) {
                }
                override fun onTabReselected(tab: TabLayout.Tab?) {

                }

            }
        )



    }
}