package com.example.map

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Model(
    @SerializedName("code")
    @Expose
    private var code: String,
    @SerializedName("message")
    @Expose
    private var message: String,
    @SerializedName("datetime")
    @Expose
    private var datetime: String
) {
   fun setcode(code :String) {
       this.code= code
   }
    fun getcode(): String {
        return this.code
    }
    fun setmess(message :String) {
        this.message= message
    }
    fun getmess(): String {
        return this.message
    }fun setdatetime(datetime: String) {
        this.datetime= datetime
    }
    fun getdatetime(): String {
        return this.datetime
    }
}