package com.noob.muxic

import android.net.Uri

// Container for information about each video.
data class Audio(
    val name: String,
    val title: String,
    val artist: String,
    val album: String,
    val art_uri: Uri,
    val musicSize: Long,
    val duration: Long,
    val musicID: Long,
    val date_added: Long,
    val date_modified: Long,
    val filePath: String,
)