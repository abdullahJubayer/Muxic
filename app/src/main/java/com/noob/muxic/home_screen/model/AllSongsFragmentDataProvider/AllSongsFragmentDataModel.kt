package com.noob.muxic.home_screen.model.AllSongsFragmentDataProvider

import com.CodeBoy.MediaFacer.mediaHolders.audioContent
import com.noob.muxic.result_listener.ResultListener

interface AllSongsFragmentDataModel {
    fun getAllMusic(listener: ResultListener<MutableList<audioContent>>)
}