package com.example.map.Retrofit
import com.example.map.Model
import retrofit2.Call
import retrofit2.http.GET
interface APIService {
    interface APIService {
        @get:GET("/api/ProvinceList")
        val posts: Call<List<Model>>
    }
}