package com.noob.muxic.home_screen.model.AllSongsFragmentDataProvider

import com.CodeBoy.MediaFacer.mediaHolders.audioContent
import com.noob.muxic.SplashActivity
import com.noob.muxic.result_listener.ResultListener

class AllSongsFragmentDataModelImplementer : AllSongsFragmentDataModel{
    override fun getAllMusic(listener: ResultListener<MutableList<audioContent>>) {
        if (SplashActivity.audioContents.isNullOrEmpty())
            listener.error("No Item Found")
        listener.onSuccess(SplashActivity.audioContents)
    }
}