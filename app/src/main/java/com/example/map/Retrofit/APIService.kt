package com.example.map.Retrofit
import com.example.map.Model
import retrofit2.Call
import retrofit2.http.GET
import java.util.ArrayList
    interface APIService {
        @GET("main/lsProvide.json")
        fun getdata(): Call<List<Model>>
    }