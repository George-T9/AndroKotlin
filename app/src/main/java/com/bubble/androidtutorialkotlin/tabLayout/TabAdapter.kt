package com.bubble.androidtutorialkotlin.tabLayout

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.bubble.androidtutorialkotlin.fragments.AdapterFragment
import com.bubble.androidtutorialkotlin.fragments.AppFragment
import com.bubble.androidtutorialkotlin.fragments.CodeFragment
import com.bubble.androidtutorialkotlin.fragments.XmlFragment

class TabAdapter(private val context: Context, private val supportFragmentManager: FragmentManager, private val tabCount: Int):
    FragmentPagerAdapter(supportFragmentManager,FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getCount(): Int {
        return tabCount
    }

    override fun getItem(position: Int): Fragment {
        return when (position){

            0 -> AppFragment()

            1 -> XmlFragment()

            2 -> CodeFragment()

            3-> AdapterFragment()

            else -> AppFragment()
        }
    }
}