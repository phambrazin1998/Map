package com.example.map

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Model(
    @SerializedName("code")
    @Expose
    private val code: String,
    @SerializedName("message")
    @Expose
    private val message: String,
    @SerializedName("datetime")
    @Expose
    private val datetime: String,
) {

}