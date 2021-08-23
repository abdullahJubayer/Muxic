package com.noob.muxic.home_screen.model.AlbumFragmentDataProvider

import com.noob.muxic.result_listener.ResultListener

interface AlbumFragmentDataModel {
    fun getAllAlbum(listener: ResultListener<ArrayList<String>>)
}