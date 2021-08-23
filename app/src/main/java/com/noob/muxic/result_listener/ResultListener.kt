package com.noob.muxic.result_listener

interface ResultListener<T> {
    fun onSuccess(data : T)
    fun error(message:String)
}