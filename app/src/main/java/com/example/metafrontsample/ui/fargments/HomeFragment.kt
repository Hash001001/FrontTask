package com.example.metafrontsample.ui.fargments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.GridLayoutManager
import com.bumptech.glide.Glide
import com.example.metafrontsample.R
import com.example.metafrontsample.databinding.FragmentHomeBinding
import com.example.metafrontsample.ui.adapters.GridLayoutAdapter
import com.example.metafrontsample.utils.Helper

class HomeFragment : Fragment() {


    val binding: FragmentHomeBinding by lazy {
        FragmentHomeBinding.inflate(layoutInflater)
    }

    private val columns = 2

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpBackground()
        setUpRecyclerView()
        clickListener()
    }

    private fun setUpRecyclerView() {
        val layoutManager = GridLayoutManager(requireContext(),2)
        binding.rvGrid.layoutManager = layoutManager
        val adapter = GridLayoutAdapter()
        layoutManager.spanSizeLookup = adapter.spanSizeLookup
        adapter.setItems(Helper.populateList())
        binding.rvGrid.adapter = adapter

        val adapterr = ConcatAdapter()
    }

    private fun setUpBackground() {
        Glide.with(this).load(R.drawable.ic_home_background).into(binding.backgroundImageView)
    }

    private fun clickListener() {
        with(binding) {
            btnDrawer.setOnClickListener {
                findNavController().navigate(R.id.action_homeFragment_to_mainFragment)
            }
        }
    }


}