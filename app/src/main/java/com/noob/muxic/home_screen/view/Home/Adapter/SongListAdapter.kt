package com.noob.muxic.home_screen.view.Home.Adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.CodeBoy.MediaFacer.mediaHolders.audioContent
import com.noob.muxic.R
import kotlinx.android.synthetic.main.item_design_song_list.view.*

class SongListAdapter(private val songList: List<audioContent>) :
    RecyclerView.Adapter<SongListAdapter.SongViewHolder>() {

    private val TAG:String="SongListAdapter"

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder {
        return SongViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_design_song_list, parent, false)
        )
    }

    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
        holder.itemView.song_name.text = songList[position].name
        holder.itemView.artist_name.text = songList[position].artist
        if (songList[position].art_uri != null)
            Log.e(TAG, "song image uri: "+ songList[position].art_uri)
//            holder.itemView.song_image.setImageURI(songList[position].art_uri)
    }

    override fun getItemCount(): Int {
        return songList.size
    }

    class SongViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}