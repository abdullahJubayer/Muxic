package com.noob.muxic.home_screen.model.AlbumFragmentDataProvider

import com.noob.muxic.SplashActivity
import com.noob.muxic.result_listener.ResultListener

class AlbumFragmentDataModelImplementer : AlbumFragmentDataModel {
    override fun getAllAlbum(listener: ResultListener<ArrayList<String>>) {
        if (SplashActivity.albumList.isNullOrEmpty())
            listener.error("No Album Found")
        listener.onSuccess(SplashActivity.albumList)
    }
}