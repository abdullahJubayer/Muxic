package com.noob.muxic.home_screen.view.Home.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.noob.muxic.R
import kotlinx.android.synthetic.main.item_design_album_list.view.*

class AlbumListAdapter (private val albumList:ArrayList<String>) : RecyclerView.Adapter<AlbumListAdapter.AlbumViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumViewHolder {
        return AlbumViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_design_album_list, parent, false)
        )
    }

    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
        holder.itemView.album_name.text = albumList[position]
        //holder.itemView.album_total_song.text = songList[position].artist
    }

    override fun getItemCount(): Int {
        return albumList.size
    }

    class AlbumViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}