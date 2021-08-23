package com.noob.muxic.home_screen.view_model

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.CodeBoy.MediaFacer.mediaHolders.audioContent
import com.noob.muxic.home_screen.model.AllSongsFragmentDataProvider.AllSongsFragmentDataModel
import com.noob.muxic.home_screen.model.AllSongsFragmentDataProvider.AllSongsFragmentDataModelImplementer
import com.noob.muxic.result_listener.ResultListener

class AllSongsFragmentViewModel(application: Application) :  AndroidViewModel(application){
    private var allSongsFragmentDataModel: AllSongsFragmentDataModel = AllSongsFragmentDataModelImplementer()
    private val allAudio: MutableLiveData<MutableList<audioContent>> = MutableLiveData<MutableList<audioContent>>()
    private val errorMessage: MutableLiveData<String> = MutableLiveData<String>()

    fun getAllAudioList(): MutableLiveData<MutableList<audioContent>> {
        allSongsFragmentDataModel.getAllMusic(object : ResultListener<MutableList<audioContent>> {
            override fun onSuccess(data: MutableList<audioContent>) {
                allAudio.value=data
            }

            override fun error(message: String) {
                errorMessage.value=message
            }
        })
        return allAudio
    }
}