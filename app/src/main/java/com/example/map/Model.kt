package com.example.map

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Model(
    @SerializedName("lat")
    @Expose
    private var lat: Double,
    @SerializedName("lng")
    @Expose
    private var lng: Double,
    @SerializedName("name")
    @Expose
    private var name: String
) {
   fun setlat(lat :Double) {
       this.lat= lat
   }
    fun getlat(): Double {
        return this.lat
    }


    fun setlng(lng :Double) {
        this.lng= lng
    }
    fun getlng(): Double {
        return this.lng
    }

    fun setname(name: String) {
        this.name= name
    }
    fun getname(): String {
        return this.name
    }
}