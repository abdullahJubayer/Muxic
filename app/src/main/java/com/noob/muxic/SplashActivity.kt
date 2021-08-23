package com.noob.muxic

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.CodeBoy.MediaFacer.AudioGet
import com.CodeBoy.MediaFacer.MediaFacer
import com.CodeBoy.MediaFacer.mediaHolders.audioContent

class SplashActivity : AppCompatActivity() {

    companion object {
        lateinit var audioContents: MutableList<audioContent>
        lateinit var albumList: ArrayList<String>
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        readAlbumFromMemory()
        readSongFromMemory()
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }

    private fun readSongFromMemory() {
        audioContents = MediaFacer
        .withAudioContex(this)
            .getAllAudioContent(AudioGet.internalContentUri)
    }
    private fun readAlbumFromMemory() {
        albumList = MediaFacer
        .withAudioContex(this)
            .getAllArtistIds(AudioGet.internalContentUri)
    }
}