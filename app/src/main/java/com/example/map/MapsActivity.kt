package com.example.map

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.map.Retrofit.APIService

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.example.map.databinding.ActivityMapsBinding
import com.google.android.gms.maps.model.PolylineOptions
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.lang.StringBuilder

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {
    lateinit var myAdapter: MyAdapter
    lateinit var layoutManager: LinearLayoutManager
    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
//        getDS()
    }


    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        val dhsphcm = LatLng(10.868366299347688, 106.76990930786042)
        mMap.addMarker(MarkerOptions().position(dhsphcm).title("Đại học sư phạm HCM"))
        val kvc = LatLng(10.777694158755118, 106.76353233660701)
        mMap.addMarker(MarkerOptions().position(kvc).title("Khu vui chơi"))
        mMap.addPolyline(PolylineOptions().add(dhsphcm,kvc))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(dhsphcm,16F))// góc nhìn màn hình
    }
    fun getDS()
    {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://raw.githubusercontent.com/MobileTeamSU12/Mobimap_Install_mobimap/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(APIService::class.java)

        val retrofitdata = retrofit.getdata()
        retrofitdata.enqueue(object : Callback<List<Model>>{
            override fun onResponse(p0: Call<List<Model>>, p1: Response<List<Model>>) {
               val  responsebody = p1.body()!!
                val lst : Spinner = findViewById(R.id.dstinhthanh)
                myAdapter = MyAdapter(baseContext,responsebody)
                myAdapter.notifyDataSetChanged()
                lst.adapter=myAdapter


            }
            override fun onFailure(p0: Call<List<Model>?>, p1: Throwable) {
              Log.d("MainActivity","Lỗi " + p1.message)
            }
        })
    }

}



