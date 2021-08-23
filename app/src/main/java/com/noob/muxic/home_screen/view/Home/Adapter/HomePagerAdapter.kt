package com.noob.muxic.home_screen.view.Home.Adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.CodeBoy.MediaFacer.mediaHolders.audioContent
import com.noob.muxic.home_screen.view.Home.Album.AlbumFragment
import com.noob.muxic.home_screen.view.Home.AllSongs.AllSongsFragment
import com.noob.muxic.home_screen.view.Home.PlayList.PlayListFragment

class HomePagerAdapter(fragment: Fragment): FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                 AllSongsFragment()
            }
            1 -> {
                 AlbumFragment()
            }
            2 -> {
                 PlayListFragment()
            }
            else -> AllSongsFragment()
        }
    }
}