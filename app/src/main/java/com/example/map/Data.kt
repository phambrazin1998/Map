package com.example.map

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("lat")
    @Expose
    val lat: Double,
    @SerializedName("lng")
    @Expose
    val lng: Double,
    @SerializedName("name")
    @Expose
    val name: String
)