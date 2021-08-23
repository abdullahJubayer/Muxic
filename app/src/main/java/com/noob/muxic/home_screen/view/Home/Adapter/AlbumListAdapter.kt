package com.noob.muxic.home_screen.view.Home.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.noob.muxic.R

class AlbumListAdapter (private val albumList:ArrayList<String>) : RecyclerView.Adapter<AlbumListAdapter.AlbumViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumViewHolder {
        return AlbumViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_design_album_list, parent, false)
        )
    }

    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
        holder.itemView.song_name.text = songList[position].name
        holder.itemView.artist_name.text = songList[position].artist
    }

    override fun getItemCount(): Int {
        return albumList.size
    }

    class AlbumViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}