package com.example.metafrontsample.ui.adapters.innerAdapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.metafrontsample.databinding.InfoItemViewBinding

class InfoListAdapter() : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return InfoItemViewHolder(InfoItemViewBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }


    override fun getItemCount(): Int = 1


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }

    inner class InfoItemViewHolder(var binding: InfoItemViewBinding) :
        RecyclerView.ViewHolder(binding.root) {
        private fun bind() {

        }
    }

}