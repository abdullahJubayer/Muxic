package com.noob.muxic.home_screen.view.Home.Album

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.noob.muxic.R
import com.noob.muxic.home_screen.view.Home.Adapter.AlbumListAdapter
import com.noob.muxic.home_screen.view.Home.Adapter.SongListAdapter
import com.noob.muxic.home_screen.view_model.AlbumFragmentViewModel
import com.noob.muxic.home_screen.view_model.AllSongsFragmentViewModel
import kotlinx.android.synthetic.main.fragment_album.*
import kotlinx.android.synthetic.main.fragment_all_songs.*

class AlbumFragment : Fragment() {

    private lateinit var adapter: AlbumListAdapter
    private lateinit var albumFragmentViewModel: AlbumFragmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_album, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        albumFragmentViewModel = ViewModelProvider(this).get(AlbumFragmentViewModel::class.java)
        albumFragmentViewModel.getAllAlbumList().observe(viewLifecycleOwner, Observer {
            adapter= AlbumListAdapter(it)
            album_recyclerView.adapter=adapter
        })
    }
}