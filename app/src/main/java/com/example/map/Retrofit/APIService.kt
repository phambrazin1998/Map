package com.example.map.Retrofit
import com.example.map.Data
import retrofit2.Call
import retrofit2.http.GET

interface APIService {
        @GET("main/lsProvide.json")
        fun getdata(): Call<List<Data>>
    }