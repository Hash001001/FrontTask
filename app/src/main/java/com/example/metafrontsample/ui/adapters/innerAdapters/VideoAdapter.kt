package com.example.metafrontsample.ui.adapters.innerAdapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.metafrontsample.databinding.VideoItemViewBinding

class VideoAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return VideoViewHolder(
            VideoItemViewBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = 1

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }


    inner class VideoViewHolder(var binding: VideoItemViewBinding) :
        RecyclerView.ViewHolder(binding.root) {

        private fun bind() {

        }

    }

}