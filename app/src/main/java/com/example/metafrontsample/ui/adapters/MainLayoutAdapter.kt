package com.example.metafrontsample.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.metafrontsample.R
import com.example.metafrontsample.databinding.GridItemBinding

class MainLayoutAdapter(): RecyclerView.Adapter<MainLayoutAdapter.MainViewHolder>() {


    class MainViewHolder(var itemView: View): RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val holder = LayoutInflater.from(parent.context).inflate(R.layout.grid_item, parent, false)
        return MainViewHolder(holder)
    }

    override fun getItemCount(): Int = 0

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {

    }


}