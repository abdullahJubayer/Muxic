package com.noob.muxic.home_screen.view.Home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.tabs.TabLayoutMediator
import com.noob.muxic.R
import com.noob.muxic.home_screen.view.Home.Adapter.HomePagerAdapter
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    private lateinit var homePagerAdapter: HomePagerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        homePagerAdapter = HomePagerAdapter(this)
        pager.adapter = homePagerAdapter
        TabLayoutMediator(tab_layout, pager) { tab, position ->
            tab.text = getTabTitle(position)
        }.attach()

    }

    private fun getTabTitle(position: Int): String {
        return when (position) {
            0 -> "Songs"
            1 -> "Playlist"
            2 -> "Album"
            else -> "Songs"
        }
    }
}