package com.example.metafrontsample.ui.adapters.innerAdapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.metafrontsample.R
import com.example.metafrontsample.databinding.ExpandableItemViewBinding

class ExpandableAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ExpandableViewHolder(
            ExpandableItemViewBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = 1

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if(holder is ExpandableViewHolder){
            holder.bind()
        }
    }


    inner class ExpandableViewHolder(var binding: ExpandableItemViewBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind() {

            binding.tvupDown.setOnClickListener {
                if(binding.hiddenLayout.visibility == View.VISIBLE){
                    binding.hiddenLayout.visibility = View.GONE
                    binding.btnDropDown.setImageResource(R.drawable.ic_down)
                    binding.tvupDown.text = "Mehr"
                }else{
                    binding.hiddenLayout.visibility = View.VISIBLE
                    binding.btnDropDown.setImageResource(R.drawable.ic_up)
                    binding.tvupDown.text = "Ausblenden"
                }

            }

            binding.btnDropDown.setOnClickListener {
                if(binding.hiddenLayout.visibility == View.VISIBLE){
                    binding.hiddenLayout.visibility = View.GONE
                    binding.btnDropDown.setImageResource(R.drawable.ic_down)
                    binding.tvupDown.text = "Mehr"
                }else{
                    binding.hiddenLayout.visibility = View.VISIBLE
                    binding.btnDropDown.setImageResource(R.drawable.ic_up)
                    binding.tvupDown.text = "Ausblenden"
                }


            }


        }

        private fun setUpBackground() {
            Glide.with(binding.expandableBg.context).load(R.drawable.ic_expandable_bg).into(binding.expandableBg)
        }

    }

}