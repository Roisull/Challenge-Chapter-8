package com.chirikualii.materidb.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class HomePagerAdapter(fragmentActivity: FragmentActivity, val listFragment :List<Fragment>,val listTitle:List<String>) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        return listFragment.size

    }

    override fun createFragment(position: Int): Fragment {
        return listFragment[position]
    }
}