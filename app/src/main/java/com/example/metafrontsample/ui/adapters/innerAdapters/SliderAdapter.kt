package com.example.metafrontsample.ui.adapters.innerAdapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.metafrontsample.MainActivity
import com.example.metafrontsample.databinding.SliderItemViewBinding
import com.example.metafrontsample.databinding.VideoItemViewBinding
import com.example.metafrontsample.ui.adapters.ViewPagerAdapter
import kotlinx.android.synthetic.main.slider_item_view.view.viewpager

class SliderAdapter(var context : Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return SliderViewHolder(
            SliderItemViewBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ), context
        )
    }

    override fun getItemCount(): Int = 1

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if(holder is SliderViewHolder){
            holder.bind()
        }
    }


    inner class SliderViewHolder(var binding: SliderItemViewBinding, var context: Context) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind() {
            binding.viewpager.adapter = ViewPagerAdapter((context as MainActivity).supportFragmentManager)
            binding.dotsIndicator.attachTo(binding.viewpager)
        }
    }

}