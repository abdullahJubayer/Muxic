package com.noob.muxic.home_screen.view.Home.AllSongs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.CodeBoy.MediaFacer.mediaHolders.audioContent
import com.google.android.material.tabs.TabLayoutMediator
import com.noob.muxic.R
import com.noob.muxic.home_screen.view.Home.Adapter.HomePagerAdapter
import com.noob.muxic.home_screen.view.Home.Adapter.SongListAdapter
import com.noob.muxic.home_screen.view_model.AllSongsFragmentViewModel
import kotlinx.android.synthetic.main.fragment_all_songs.*
import kotlinx.android.synthetic.main.fragment_home.*

class AllSongsFragment() : Fragment() {

    private lateinit var adapter:SongListAdapter
    private lateinit var allSongsFragmentViewModel: AllSongsFragmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_all_songs, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        allSongsFragmentViewModel = ViewModelProvider(this).get(AllSongsFragmentViewModel::class.java)
        allSongsFragmentViewModel.getAllAudioList().observe(viewLifecycleOwner, Observer {
            adapter= SongListAdapter(it)
            songListRecyclerView.adapter=adapter
        })
    }
}