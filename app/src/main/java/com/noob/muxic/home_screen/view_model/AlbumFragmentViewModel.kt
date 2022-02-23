package com.noob.muxic.home_screen.view_model

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.noob.muxic.home_screen.model.AlbumFragmentDataProvider.AlbumFragmentDataModelImplementer
import com.noob.muxic.result_listener.ResultListener

class AlbumFragmentViewModel(application: Application) : AndroidViewModel(application) {
    private var albumFragmentDataModel: AlbumFragmentDataModelImplementer = AlbumFragmentDataModelImplementer()
    private val allAlbum: MutableLiveData<ArrayList<String>> = MutableLiveData<ArrayList<String>>()
    private val errorMessage: MutableLiveData<String> = MutableLiveData<String>()

    fun getAllAlbumList(): MutableLiveData<ArrayList<String>> {
        albumFragmentDataModel.getAllAlbum(object : ResultListener<ArrayList<String>> {
            override fun onSuccess(data: ArrayList<String>) {
                allAlbum.value=data
            }

            override fun error(message: String) {
                errorMessage.value=message
            }
        })
        return allAlbum
    }
}