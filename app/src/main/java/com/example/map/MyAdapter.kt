package com.example.map

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val context: Context,val tinhthanh:List<Model>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
         var name : TextView
         init {
             name=itemView.findViewById(R.id.txtname)
         }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       var itemView = LayoutInflater.from(context).inflate(R.layout.item,parent,false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text= tinhthanh[position].getname()
    }

    override fun getItemCount(): Int {
       return tinhthanh.size
    }

}

